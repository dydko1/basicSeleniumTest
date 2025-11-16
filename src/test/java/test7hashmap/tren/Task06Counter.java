package test7hashmap.tren;

import java.util.HashMap;
import java.util.Map;

public class Task06Counter {
    public static void main(String[] args) {
        String text = "ala ma kota ala lubi kota";
        Map<String, Integer> counter = new HashMap<>();
        for (String s : text.split(" "))
            counter.put(s, counter.getOrDefault(s, 0) + 1);
        System.out.println(counter);
    }
}
