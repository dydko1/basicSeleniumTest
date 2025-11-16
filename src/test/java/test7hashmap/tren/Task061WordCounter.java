package test7hashmap.tren;

import java.util.HashMap;
import java.util.Map;

public class Task061WordCounter {
    public static void main(String[] args) {
        String text = "ala ma kota ala lubi kota";
        Map<String, Integer> counter = new HashMap<>();
        System.out.println(counter);

        for (String w : text.split(" ")) {
            counter.put(w, counter.getOrDefault(w, 0) + 1);
        }
        System.out.println(counter);
    }
}