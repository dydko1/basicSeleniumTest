package pl.sii.javalambda.lambdaSyntax.a;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodReference1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = Integer::valueOf;
        Function<String, Integer> func2 = Integer::valueOf;
        BiFunction<String, Integer, Integer> func3 = Integer::valueOf;

        System.out.println(func1.apply(11));
        System.out.println(func2.apply("7"));
        System.out.println(func3.apply("00110000",2));
    }
}
