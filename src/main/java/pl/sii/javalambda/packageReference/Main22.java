package pl.sii.javalambda.packageReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> lambda = val -> val + 10;
        List<Integer> doubled = numbers
                .stream()
                .map(lambda)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }
}
