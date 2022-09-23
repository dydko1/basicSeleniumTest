package pl.sii.trash.lambda3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMap11 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Non Existent Title1".equals(e.getValue()))
                .map(Map.Entry::getKey).findFirst();

        List<String> title=books.entrySet().stream().filter(e->e.getKey().startsWith("978-0"))
                        .map(Map.Entry::getValue).collect(Collectors.toList());

        assertEquals(false, optionalIsbn.isPresent());

        //assertTrue(title.contains("Effective Java"));
        System.out.println(title.contains("Design patterns : elements of reusable object-oriented software"));
        //System.out.println(title.get(1).contains("Eff"));
        //System.out.println("------------");
        //System.out.println(books.get("978-0201633610").contains("elements"));
    }
}
