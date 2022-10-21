package w3schools.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Miro", "Janu", "Edek", "Vit");
        names.stream().forEach(System.out::println);
    }
}
