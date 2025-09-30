package test6.function1.mkyong.firstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindFirstExample2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("node", "java", "python", "ruby");

        Optional<String> result = list.stream()
                .filter(x -> !x.equalsIgnoreCase("node"))
                .findFirst();

        if (result.isPresent()) {
            System.out.println(result.get()); // java
        } else {
            System.out.println("no value?");
        }

    }

}