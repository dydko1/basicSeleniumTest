package pl.sii.streams.c;

import java.util.HashMap;
import java.util.Map;

public class JavaStreamFilterMapByValues {
    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();

        hmap.put("de", "Germany");
        hmap.put("hu", "Hungary");
        hmap.put("sk", "Slovakia");
        hmap.put("si", "Slovenia");
        hmap.put("so", "Somalia");
        hmap.put("us", "United States");
        hmap.put("ru", "Russia");

        hmap.entrySet().stream().filter(m->m.getValue().equals("Slovakia")||m.getValue().equals("Slovenia")).forEach(System.out::println);
    }
}
