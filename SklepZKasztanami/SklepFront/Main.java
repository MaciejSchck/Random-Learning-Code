import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:5500/kasztany"))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());
    }
    public String fetchUserInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz swoją plecioną z wikliny replikę kosowskiego kasztana:");
        return scanner.next();
    }
}
