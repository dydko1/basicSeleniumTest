package pl.sii.streams.b;

import java.util.stream.Stream;

public class GFG2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("GEeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        //stream.filter(s -> Character.isUpperCase(s.charAt(1))).forEach(System.out::println);

        //stream.forEach(s-> System.out.println(s));

        System.out.println("----------------");
        stream.filter(s->s.endsWith("s")).forEach(System.out::println);
    }
}
