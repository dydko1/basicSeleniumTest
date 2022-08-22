package pl.sii.javaBeginers.doublecolon.c;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2a {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> func1 = (a, b) -> Math.pow(a, b);

        System.out.println(func1.apply(52, 61));

        Function<Integer, Integer> func2 = a -> 50 + a;

        System.out.println(func2.apply(50));
    }
}
