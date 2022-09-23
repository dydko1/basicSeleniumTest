package pl.sii.trash.lambda4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test123 {
    public static void main(String[] args) {
        Person lokeshOne = new Person(1, "Lokesh", "Gupta");
        Person lokeshTwo = new Person(1, "Lokesh", "Gupta");
        Person lokeshThree = new Person(1, "Lokesh", "Gupta");
        Person brianOne = new Person(1, "Lokesh", "Gupta");
        Person brianTwo = new Person(1, "Lokesh", "Gupta");
        Person alex = new Person(1, "Lokesh", "Gupta");

        Collection<Person> list = Arrays.asList(alex,
                brianOne,
                brianTwo,
                lokeshOne,
                lokeshTwo,
                lokeshThree);

        List<Person> distinctElements = list.stream()
                .distinct()
                .collect( Collectors.toList() );

        System.out.println( distinctElements );
    }
}
