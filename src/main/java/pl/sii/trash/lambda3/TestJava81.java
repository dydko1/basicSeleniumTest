package pl.sii.trash.lambda3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava81 {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("b", "b", "c", "d", "e");

        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha)
            alphaUpper.add(s.toUpperCase());

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);


        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
