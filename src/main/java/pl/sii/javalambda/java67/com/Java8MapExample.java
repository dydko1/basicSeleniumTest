package pl.sii.java67.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Java8MapExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Londyn", "Warszawa", "Paryż", "Berlin");
        System.out.println(transform(cities));

        System.out.println("list transformed using loop before Java 8 : " + beforeJava8(cities));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squares = numbers.stream()
                .map(i -> {
                    return i * i;
                })
                .collect(Collectors.toList());
        System.out.println(squares);

    }

    private static List<String> transform(List<String> listOfString) {
        return listOfString.stream()
                .map(s -> {
                    return s.toUpperCase() + " new Stream";
                })
                .collect(Collectors.toList());
    }

    private static List<String> beforeJava8(List<String> listOfString) {
        List<String> coll = new ArrayList<>();
        for (String str : listOfString) {
            coll.add(str.toUpperCase());
        }
        return coll;
    }
}
