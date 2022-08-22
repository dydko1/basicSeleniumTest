package pl.sii.javaBeginers.doublecolon.cc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunction2c {

    public static void main(String[] args) {

        String res1 = convert(2, 4, (a, b) -> Math.pow(a, b), r -> "Test=" + r);
        System.out.println(res1);

        String res2 = convert(10, 5, (a1, a2) -> (a1 * a2) + 100, r -> "kkk+" + r);
        System.out.println(res2);

        String res3 = convert("a", "ccccc", (k1, k2) -> k1 + k2, k1 -> k1.toUpperCase());
        System.out.println(res3);

        Integer res4 = convert("100", "200", (a, b) -> Integer.parseInt(a) + Integer.parseInt(b), k -> k + 20);
        System.out.println(res4);

    }

    public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
                                              BiFunction<A1, A2, R1> func1,
                                              Function<R1, R2> func2) {
        return func1.andThen(func2).apply(a1, a2);
    }
}