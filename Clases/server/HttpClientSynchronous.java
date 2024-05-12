import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.time.Duration;
import java.util.Arrays;

public class HttpClientSynchronous {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.err.println("Usage: java HttpClientSynchronous <number>");
            System.exit(1);
        }

        Demo object = new Demo(2024, "Prueba serializacion y deserializacion");

        byte[] serializedObject = SerializationUtils.serialize(object);
        System.out.println("Objeto serializado byte por byte (-128 a 127):");
        System.out.println(Arrays.toString(serializedObject));

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofByteArray(serializedObject))
                .uri(URI.create("http://localhost:8080/objeto"))
                .setHeader("Content-Type", "application/octet-stream")
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        long startTime = System.nanoTime();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        long finishTime = System.nanoTime();

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());

        HttpHeaders headers = response.headers();
        if (headers.firstValue("X-Server-Processing-Time").isPresent()) {
            String processingTime = headers.firstValue("X-Server-Processing-Time").get();
            System.out.println("Server processing time: " + processingTime + " nanoseconds");
        }
    }
}