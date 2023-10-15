package pl.sii.javalambda.functionalInterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private int age;
}
