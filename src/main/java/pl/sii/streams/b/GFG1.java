package pl.sii.streams.b;

import java.util.Arrays;
import java.util.List;

public class GFG1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 40, 5, 66);

        list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
    }
}
