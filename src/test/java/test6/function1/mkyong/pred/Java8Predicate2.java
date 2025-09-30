package test6.function1.mkyong.pred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThen5 = x -> x >= 5;
        Predicate<Integer> lessThen9 = x -> x < 9;
        //Predicate<Integer> greaterThen5LessThen9 = x -> x > 5 && x < 9;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(greaterThen5.and(lessThen9)).toList();
        System.out.println(collect);
    }
}
