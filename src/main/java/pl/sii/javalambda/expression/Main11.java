package pl.sii.javalambda.expression;

import java.util.function.Function;

public class Main11 {
    public static void main(String[] args) {
        final String x = "Hello";
        Function<String, String> func1 = y -> {
            return y + "\t" + x;
        };
        System.out.println(func1.apply("EEEE"));
    }
}
