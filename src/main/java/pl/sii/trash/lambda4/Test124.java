package pl.sii.trash.lambda4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test124 {
    public static void main(String[] args) {
        List<Person1> person1s = Arrays.asList(
                new Person1(1, "Miro1"),
                new Person1(2, "Miro2"),
                new Person1(3, "Miro3"),
                new Person1(4, "Miro4")
        );


        List<String> aa = new ArrayList<>();

        person1s.stream().forEach(p-> System.out.println(p.getName()));
        //System.out.println(aa);
    }
}
