package test7hashmap.tren;

import java.util.Map;
import java.util.stream.Collectors;

public class Task03MapStream {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of("Mirek", 120,
                "Łukasz", 180,
                "Anna", 150);

        scores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        System.out.println("-------------");
        Map<String, Integer> filtered = scores.entrySet().stream()
                .filter(e -> e.getValue() > 150)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filtered);
    }
}
