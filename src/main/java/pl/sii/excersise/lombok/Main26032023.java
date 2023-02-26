package pl.sii.excersise.lombok;

import pl.sii.javaBeginers.doublecolon.a.Per;

import java.util.Collections;

public class Main26032023 {
    public static void main(String[] args) {
        Person person = Person
                .buildPerson()
                .age(20)
                .firstName("Miro")
                .lastName("Dydko")
                .tags(Collections.singletonList("Emka"))
                .build();

        System.out.println(person.getLastName());
        person.setTags(Collections.singletonList("ddddddd"));
        System.out.println(person.getTags().get(0));
    }
}
