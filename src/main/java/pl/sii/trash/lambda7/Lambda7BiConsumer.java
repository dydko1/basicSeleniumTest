package pl.sii.trash.lambda7;

import java.util.HashMap;

public class Lambda7BiConsumer {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Bill", 22);
        hashMap.put("Miro", 42);
        hashMap.put("Michael", 28);
        hashMap.forEach((name1, age1) -> System.out.println(name1 + "\t" + age1));
    }
}
