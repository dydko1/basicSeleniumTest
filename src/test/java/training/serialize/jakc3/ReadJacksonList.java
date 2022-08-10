package training.serialize.jakc3;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.failsafe.function.CheckedRunnable;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ReadJacksonList {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Book> books = Arrays.asList(mapper.readValue(Paths.get("src/test/resources/book2.json").toFile(), Book[].class));

            books.forEach((n) -> System.out.println("kk=" + n));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
