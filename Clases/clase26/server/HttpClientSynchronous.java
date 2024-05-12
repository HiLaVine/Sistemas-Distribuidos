import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientSynchronous {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.out.println("Usage: HttpClientSynchronous <lineNumber>");
            return;
        }

        int lineNumber = Integer.parseInt(args[0]);
        if (lineNumber <= 0) {
            System.out.println("Line number must be a positive integer.");
            return;
        }

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/readLine?lineNumber=" + lineNumber))
                .setHeader("Content-Type", "text/plain")
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("X-Debug", "true")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Print status code
        System.out.println("Status code: " + response.statusCode());

        // Print response body
        System.out.println("Response body (line " + lineNumber + "): " + response.body());
    }
}
