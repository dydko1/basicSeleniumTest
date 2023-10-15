package pl.sii.javalambda.functionalprogramminginjavaexplained;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoFunctionalPrograming {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World", "How", "Are", "You", "Today");

        List<String> newList = stringList.stream()
                .filter(s -> s.equals("Hello") || s.equals("Are"))
                .map(s -> s + " String")
                .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }
}
