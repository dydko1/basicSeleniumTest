package test7hashmap.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonPlaceholderUsersExample {

    public static void main(String[] args) throws Exception {
        // 1. Klient HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 2. Request GET na /users
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();

        // 3. Wysłanie requestu i pobranie body jako String
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        String jsonBody = response.body();

        // 4. Parsowanie JSON -> List<Map<String, Object>>
        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, Object>> users = mapper.readValue(
                jsonBody,
                new TypeReference<List<Map<String, Object>>>() {
                }
        );

        // 5. Budowa HashMap: id -> name
        Map<Integer, String> usersById = new HashMap<>();

        for (Map<String, Object> user : users) {
            // id jest liczbą – Jackson zazwyczaj daje Integer
            Integer id = (Integer) user.get("id");
            String name = (String) user.get("name");

            usersById.put(id, name);
        }

        // 6. Sprawdzenie, co mamy
        System.out.println("Users by id: " + usersById);

        // Przykład użycia: pobierz imię usera o id = 3
        System.out.println("User 3 name = " + usersById.get(3));
    }
}