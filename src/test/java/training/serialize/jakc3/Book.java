package training.serialize.jakc3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Book {

    private String title;
    private String isbn;
    private long year;
    private String[] authors;

    // getters and setters, equals(), toString() .... (omitted for brevity)
}