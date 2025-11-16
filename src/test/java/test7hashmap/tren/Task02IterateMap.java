package test7hashmap.tren;


import java.util.HashMap;
import java.util.Map;

public class Task02IterateMap {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices = Map.of("Chleb", 5.22, "Maslo", 8.99, "Mleko", 3.5);
        for (String key : prices.keySet()) {
            System.out.println("Produkt: " + key);
        }
        for (Double value : prices.values()) {
            System.out.println("cena: " + value);
        }
        System.out.println("-------------");
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry);
        }
    }
}
