package pl.sii.javaBeginers.doublecolon.c;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Java8BiFunction1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (a1, a2) -> a1 + a2;
        System.out.println(func.apply(25, 75));

        BiFunction<Integer, Integer, Double> fun2 = (x1, x2) -> Math.pow(x1, x2);
        System.out.println(fun2.apply(12,34));

        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> res = func3.apply(2, 3);
        System.out.println(res);
    }
}
