package training.serialize.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class JacksonDemo {
    public static void main(String[] args) throws IOException {
        //ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        Article article = new Article(1, "Przygody Mira", Arrays.asList("tag1", "tag2"));

        String json = mapper.writeValueAsString(article);
        System.out.println(json);

        String json2 = "{\"id\":1,\"title\":\"Test Title\",\"tags\":[\"Test Tag\"]}";

        ObjectMapper mapper2 = new ObjectMapper();
        Article newArticle = mapper2.readValue(json2, Article.class);

        System.out.println(newArticle);

        URL url = JacksonDemo.class.getClassLoader().getResource("article1.json");

        newArticle = mapper.readValue(new File(url.getFile()), Article.class);

        System.out.println(newArticle);
    }
}
