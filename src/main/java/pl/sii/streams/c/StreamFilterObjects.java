package pl.sii.streams.c;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterObjects {
    public static void main(String[] args) {
        List<User> persons = List.of(new User("Jack", "jack234@gmail.com"),
                new User("Peter", "pete2@post.com"),
                new User("Lucy", "lucy17@gmail.com"),
                new User("Robert", "bob56@post.com"),
                new User("Martin", "mato4@imail.com"));

        List<User> result = persons.stream().filter(per -> per.getEmail().matches(".*post\\.com")).collect(Collectors.toList());

        result.forEach(p -> System.out.println(p.getName() + "\t" + p.getEmail()));

    }
}
