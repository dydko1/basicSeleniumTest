package test7hashmap.tren;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task05WordCounterStream {
    public static void main(String[] args) {
        String text = "ala ma kota ala lubi kota";

        Map<String, Long> counter = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        counter.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
