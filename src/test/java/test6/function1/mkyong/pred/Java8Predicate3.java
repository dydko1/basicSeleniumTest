package test6.function1.mkyong.pred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Predicate3 {
    public static void main(String[] args) {
        Predicate<String> length3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        //System.out.println(list.stream().filter(length3.or(startWithA)).toList());
        System.out.println(list.stream().filter(startWithA.negate()).toList());
    }
}
