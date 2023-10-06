package pl.sii.javalambda.expression;

import java.util.function.Function;

public class Main12 {
    public static void main(String[] args) {
        Function<String, String> func1 = y -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 4) {
                    break;
                }
            }
            return y + " from java2s.com";
        };
        System.out.println(func1.apply("hi"));
    }
}
