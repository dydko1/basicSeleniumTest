package test7hashmap.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class API1 {
    public static void main(String[] args) throws IOException {
        String apiUrl = "https://jsonplaceholder.typicode.com/users";

        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");

        Scanner scanner = new Scanner(connection.getInputStream());
        String json = scanner.useDelimiter("\\A").next();
        scanner.close();

        System.out.println(json);
    }
}
