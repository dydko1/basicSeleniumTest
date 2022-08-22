package pl.sii.javaBeginers.doublecolon.c;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2b {
    public static void main(String[] args) {

        String result = powToString(3, 4, (a1 , b1)->Math.pow(a1, b1), r -> "Wynik=" + r);
        System.out.println(result);

    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func1,
                                    Function<Double, R> func2) {
        return func1.andThen(func2).apply(a1, a2);

    }
}
