package pl.sii.javaBeginers.collections;

import java.util.*;

public class FirstArray {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> integers = new LinkedHashMap<>();
        TreeMap<Integer, String> stringTreeMap = new TreeMap<>();

        listMap(hashMap);
        System.out.println("----------");
        listMap(integers);
        System.out.println("----------");
        listMap(stringTreeMap);

    }

    private static void listMap(Map<Integer, String> stringMap) {
        stringMap.put(1, "cat");
        stringMap.put(20, "dog");
        stringMap.put(430, "caw");
        stringMap.put(20, "caw");

        for (Integer key : stringMap.keySet()) {
            System.out.println(key +": " +stringMap.get(key));
        }

    }
}
