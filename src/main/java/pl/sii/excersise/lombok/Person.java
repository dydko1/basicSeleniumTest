package pl.sii.excersise.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
@Builder(builderMethodName = "buildPerson")
public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private List<String> tags;


}
