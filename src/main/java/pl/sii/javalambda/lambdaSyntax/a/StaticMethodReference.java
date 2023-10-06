package pl.sii.javalambda.lambdaSyntax.a;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodReference {
    public static void main(String[] args) {
        Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
        System.out.println("Wynik:\t" + func1.apply(40));

        Function<Integer, String> func2 = Integer::toBinaryString;
        System.out.println("Result 2:\t" + func2.apply(20));

        BiFunction<Integer, Integer, Integer> funcBi1 = (x, y) -> Integer.sum(x, y);
        System.out.println("Result Bi3:\t" + funcBi1.apply(10, 50));

        BiFunction<Integer, Integer, Integer> funcBi2 = Integer::sum;
        System.out.println("Result Bi4:\t" + funcBi2.apply(50, 60));
    }
}