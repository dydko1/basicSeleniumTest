package test7hashmap.tren;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task03SortMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Zosia", 2, "Adam", 5, "Kasia", 3);
        System.out.println("Przez sortowaniem: " + map);
        Map<String, Integer> sorted = new TreeMap<>(map);
        System.out.println("Po sortowaniu: " + sorted);
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(s -> System.out.println(s.getKey() + " -> " + s.getValue()));

    }
}
