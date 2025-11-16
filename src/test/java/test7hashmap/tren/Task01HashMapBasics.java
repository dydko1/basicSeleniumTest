package test7hashmap.tren;

import java.util.HashMap;
import java.util.Map;

public class Task01HashMapBasics {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Mirek", 10);
        scores.put("Adam", 22);
        scores.put("Luaksz", 212);
        scores.put("Lukasz", 101);
        scores.put("Lukasz2",null);
        scores.put("Lukasz3",null);
        System.out.println("Wynik:" + scores);
        System.out.println("Wynik Mirka: " + scores.get("Mirek1"));
        scores.remove("Lukasz");
        System.out.println(scores);
    }
}
