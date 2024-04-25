import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientSynchronous {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {

        // Create the request
        String n = args[0];

        // cuerpo de la solicitud
        String r = n;

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(Integer.toString(n))) // change to POST and add 'n' to the
                                                                                // body
                .uri(URI.create("http://localhost:8080/sumafibonacci")) // change the endpoint to '/sumafibonacci'
                .header("Content-Type", "text/plain")
                .header("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("X-Debug", "true") // add debug header
                .POST(BodyPublishers.ofString(r)) // Establecer el cuerpo de la solicitud
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print response headers
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body());

        // print processing time
        // System.out.println("Processing time: " +
        // headers.firstValue("X-debug-info").orElse("N/A"));
        if (response.headers().firstValue("X-Debug-Info").isPresent()) {
            System.out.println("Debug info: " + response.headers().firstValue("X-Debug-Info").get());
        }

    }
}