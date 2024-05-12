import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.concurrent.Executors;

public class WebServer {
    private static final String SUMA_FIBONACCI_ENDPOINT = "/sumafibonacci";
    private static final String STATUS_ENDPOINT = "/status";
    private static final String OBJETO_ENDPOINT = "/objeto";

    private final int port;
    private HttpServer server;

    public static void main(String[] args) {
        int serverPort = 8080;
        if (args.length == 1) {
            serverPort = Integer.parseInt(args[0]);
        }

        WebServer webServer = new WebServer(serverPort);
        webServer.startServer();

        System.out.println("Servidor escuchando en el puerto " + serverPort);
    }

    public WebServer(int port) {
        this.port = port;
    }

    public void startServer() {
        try {
            this.server = HttpServer.create(new InetSocketAddress(port), 0);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        HttpContext sumaFibonacciContext = server.createContext(SUMA_FIBONACCI_ENDPOINT);
        HttpContext statusContext = server.createContext(STATUS_ENDPOINT);
        HttpContext objetoContext = server.createContext(OBJETO_ENDPOINT);

        sumaFibonacciContext.setHandler(this::handleSumaFibonacciRequest);
        statusContext.setHandler(this::handleStatusCheckRequest);
        objetoContext.setHandler(this::handleObjetoRequest);

        server.setExecutor(Executors.newFixedThreadPool(8));
        server.start();
    }

    private void handleSumaFibonacciRequest(HttpExchange exchange) throws IOException {
    }

    private void handleStatusCheckRequest(HttpExchange exchange) throws IOException {
    }

    private void handleObjetoRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("post")) {
            exchange.close();
            return;
        }

        Headers headers = exchange.getRequestHeaders();
        boolean isDebugMode = headers.containsKey("X-Debug") && headers.get("X-Debug").get(0).equalsIgnoreCase("true");

        long startTime = System.nanoTime();

        byte[] requestBytes = exchange.getRequestBody().readAllBytes();
        System.out.println("Objeto serializado recibido byte por byte (-128 a 127):");
        System.out.println(Arrays.toString(requestBytes));
        Demo objeto = (Demo) SerializationUtils.deserialize(requestBytes);
        System.out.println("Objeto deserializado: a = " + objeto.a + ", b = " + objeto.b);

        long finishTime = System.nanoTime();

        String responseBody = String.format("Objeto recibido: a = %d, b = %s\n", objeto.a, objeto.b);

        if (isDebugMode) {
            String debugMessage = String.format("La operación tomó %d nanosegundos", finishTime - startTime);
            exchange.getResponseHeaders().put("X-Debug-Info", Arrays.asList(debugMessage));
        }

        exchange.getResponseHeaders().put("X-Server-Processing-Time", Arrays.asList(String.valueOf(finishTime - startTime)));
        sendResponse(responseBody.getBytes(), exchange);
    }

    private void sendResponse(byte[] responseBytes, HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, responseBytes.length);
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(responseBytes);
        outputStream.flush();
        outputStream.close();
        exchange.close();
    }
}

class Demo implements java.io.Serializable
{
      public int a;
      public String b;
 
      // Default constructor
      public Demo(int a, String b)
      {
             this.a = a;
             this.b = b;
      }
}