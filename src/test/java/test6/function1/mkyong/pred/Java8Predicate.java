package test6.function1.mkyong.pred;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Predicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).toList();
        System.out.println(collect);

    }
}
