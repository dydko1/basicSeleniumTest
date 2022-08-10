package training.serialize.start1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class Person implements Serializable {
    private int id;
    private String name;
}
