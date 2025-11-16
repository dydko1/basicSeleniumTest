package test7hashmap.tren;

import java.util.List;

public class Task01NewBasics {
    public static void main(String[] args) {
        List<String> names = List.of("Mirek", "Łukasz", "Ania");
        names.forEach(System.out::println);
        System.out.println("----------");
        names.stream()
                .filter(n -> n.length() > 4)
                .forEach(System.out::println);

    }
}
