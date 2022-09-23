package pl.sii.trash.lambda2;

import java.util.Arrays;
import java.util.List;

public class LambdaOperator {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "a4", "c3", "c4", "c1");

        myList.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
