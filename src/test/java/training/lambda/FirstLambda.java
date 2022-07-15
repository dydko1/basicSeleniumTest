package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 100);

        numbers.forEach(n -> System.out.println(n));
    }
}
