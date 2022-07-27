package training.serialize.jakc3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadJackson {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Book book = mapper.readValue(Paths.get("src/test/resources/book.json").toFile(), Book.class);

            System.out.println(book);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
   }
}
