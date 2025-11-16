package test7hashmap.tren;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tak04GroupingExample {
    public static void main(String[] args) {
        List<String> names = List.of("Mirek", "Ania", "Ola", "Alicja", "Łukasz");

        Map<Integer,List<String>> grouped =names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
