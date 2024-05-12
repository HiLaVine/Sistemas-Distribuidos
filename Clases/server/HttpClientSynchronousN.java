import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientSynchronousN {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.out.println("Usage: HttpClientSynchronous <number>");
            return;
        }

        String number = args[0];

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://numbersapi.com/" + number))
                .header("Accept", "text/plain")
                .header("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Print status code
        System.out.println("Status code: " + response.statusCode());

        // Print response headers
        System.out.println("Response headers: " + response.headers());

        // Print response body
        System.out.println("Response body: " + response.body());
    }
}
