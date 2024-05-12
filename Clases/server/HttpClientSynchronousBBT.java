import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import com.google.gson.Gson;

public class HttpClientSynchronousBBT {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest requestBB = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.breakingbadquotes.xyz/v1/quotes/3"))
                .header("Accept", "application/json")
                .header("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> responseBB = httpClient.send(requestBB, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson(); 
        Quote[] quotes = gson.fromJson(responseBB.body(), Quote[].class);


        for (Quote quote : quotes) {
            String url = "https://translation.googleapis.com/language/translate/v2" +
                         "?target=es" +
                         "&key=AIzaSyAuTGfew_k0HIqzFlQkDTZtCH_aAPZIhos" + 
                         "&q=" + URLEncoder.encode(quote.getQuote(), "UTF-8");

            HttpRequest requestTranslate = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(url))
                    .header("User-Agent", "Java 11 HttpClient Bot")
                    .build();

            HttpResponse<String> responseTranslate = httpClient.send(requestTranslate, HttpResponse.BodyHandlers.ofString());

            Translation translation = gson.fromJson(responseTranslate.body(), Translation.class);

            System.out.println("Cita en ingles: " + quote.getQuote());
            System.out.println("Autor: " + quote.getAuthor());
            System.out.println("Cita traducida: " + translation.getData().getTranslations()[0].getTranslatedText());
            System.out.println();
        }
    }
}

class Quote {
    private String quote;
    private String author;

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}

class Translation {
    private TranslationData data;

    public TranslationData getData() {
        return data;
    }
}

class TranslationData {
    private TranslationTranslations[] translations;

    public TranslationTranslations[] getTranslations() {
        return translations;
    }
}

class TranslationTranslations {
    private String translatedText;

    public String getTranslatedText() {
        return translatedText;
    }
}
