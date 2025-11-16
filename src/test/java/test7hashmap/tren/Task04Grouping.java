package test7hashmap.tren;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task04Grouping {
    public static void main(String[] args) {
        List<String> names = List.of("Mirek", "Ania", "Ola", "Alicja", "Łukasz");
        Map<Integer, List<String>> grouped = names
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
        for (Integer number:grouped.keySet())
            System.out.println(number);
        for (List<String> s:grouped.values())
            System.out.println(s);
        for (Map.Entry<Integer, List<String>> map1:grouped.entrySet())
            System.out.println(map1);
    }
}
