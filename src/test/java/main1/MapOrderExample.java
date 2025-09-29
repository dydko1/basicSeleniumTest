package main1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrderExample {
    public static void main(String[] args) {
        Map<String, Integer> hash =
                Map.of("czwarty", 4,
                        "drugi", 2,
                        "pierwszy", 1,
                        "trzeci", 3);
//                new HashMap<>();
//        hash.put("czwarty", 4);
//        hash.put("drugi", 2);
//        hash.put("pierwszy", 1);
//        hash.put("trzeci", 3);

        Map<String, Integer> linkedList = new LinkedHashMap<>();
        linkedList.put("czwarty", 4);
        linkedList.put("drugi", 2);
        linkedList.put("pierwszy", 1);
        linkedList.put("trzeci", 3);

        hash.forEach((k, v) -> System.out.println(k + "\t" + v));
        System.out.println("----------------------------------");
        linkedList.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
}
