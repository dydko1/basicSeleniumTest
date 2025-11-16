package test7hashmap.tren;

import java.util.HashMap;
import java.util.Map;

public class Tak06PlayerRanking {
    public static void main(String[] args) {
        Map<String, Integer> ranking = new HashMap<>();
        ranking.put("Mirek", 120);
        ranking.put("Łukasz", 180);
        ranking.put("Anna", 150);

        ranking.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
