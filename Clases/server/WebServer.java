import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.concurrent.Executors;

public class WebServer {
    private static final String SUMA_FIBONACCI_ENDPOINT = "/sumafibonacci";
    private static final String STATUS_ENDPOINT = "/status";
    private static final String READ_LINE_ENDPOINT = "/readLine";
    private static final String FILE_PATH = "El_viejo_y_el_mar.txt";

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
        HttpContext readLineContext = server.createContext(READ_LINE_ENDPOINT);

        sumaFibonacciContext.setHandler(this::handleSumaFibonacciRequest);
        statusContext.setHandler(this::handleStatusCheckRequest);
        readLineContext.setHandler(this::handleReadLineRequest);

        server.setExecutor(Executors.newFixedThreadPool(8));
        server.start();
    }

    private void handleSumaFibonacciRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("post")) {
            exchange.close();
            return;
        }

        Headers headers = exchange.getRequestHeaders();
        boolean isDebugMode = headers.containsKey("X-Debug") && headers.get("X-Debug").get(0).equalsIgnoreCase("true");

        long startTime = System.nanoTime();

        String requestBody = new String(exchange.getRequestBody().readAllBytes());
        BigInteger n = new BigInteger(requestBody);
        BigInteger result = calculateSumaFibonacci(n);

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;

        // Convierte el tiempo total de procesamiento a segundos y milisegundos
        long seconds = elapsedTime / 1_000_000_000;
        long milliseconds = (elapsedTime % 1_000_000_000) / 1_000;

        String responseBody = String.format("La suma de fibonacci de %s es %s\n", n, result);

        if (isDebugMode) {
            String debugMessage = String.format("La operación tomó %d segundos y %d milisegundos", seconds, milliseconds);
            exchange.getResponseHeaders().put("X-Debug-Info", Arrays.asList(debugMessage));
        }

        exchange.getResponseHeaders().put("X-Server-Processing-Time", Arrays.asList(String.valueOf(elapsedTime)));
        sendResponse(responseBody.getBytes(), exchange);
    }

    private BigInteger calculateSumaFibonacci(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        BigInteger bigN = new BigInteger(String.valueOf(n));

        while (a.compareTo(bigN) < 0) {
            if (a.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                sum = sum.add(a);
            }
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
        }

        return sum;
    }

    private void handleStatusCheckRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("get")) {
            exchange.close();
            return;
        }

        String responseMessage = "El servidor está vivo\n";
        sendResponse(responseMessage.getBytes(), exchange);
    }

    private void handleReadLineRequest(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equalsIgnoreCase("GET")) {
            exchange.close();
            return;
        }

        Headers headers = exchange.getRequestHeaders();
        boolean isDebugMode = headers.containsKey("X-Debug") && headers.get("X-Debug").get(0).equalsIgnoreCase("true");
    
        long startTime = System.nanoTime();
    
        // Obtenemos la ruta de la solicitud
        String requestPath = exchange.getRequestURI().getPath();
        // Dividimos la ruta por "/"
        String[] pathParts = requestPath.split("/");
        // El último elemento en el arreglo será el número de línea
        int lineNumber = Integer.parseInt(pathParts[pathParts.length - 1]);
    
        String line = readLineFromFile(lineNumber);
    
        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
    
        // Convierte el tiempo total de procesamiento a segundos y milisegundos
        long seconds = elapsedTime / 1_000_000_000;
        long milliseconds = (elapsedTime % 1_000_000_000) / 1_000;
    
        String responseBody = "Línea " + lineNumber + ": " + line + "\n";
    
        if (isDebugMode) {
            String debugMessage = String.format("La operación tomó %d segundos y %d milisegundos", seconds, milliseconds);
            exchange.getResponseHeaders().put("X-Debug-Info", Arrays.asList(debugMessage));
        }
    
        exchange.getResponseHeaders().put("X-Server-Processing-Time", Arrays.asList(String.valueOf(elapsedTime)));
        sendResponse(responseBody.getBytes(), exchange);
    }

    private String readLineFromFile(int lineNumber) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            int currentLine = 0;
            while ((line = reader.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    return line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Línea no encontrada";
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
