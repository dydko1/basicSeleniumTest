package pl.sii.javalambda.lambdaSyntax;

import java.util.function.Function;

public class StaticMethodReference {
    public static void main(String[] args) {
        Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
        System.out.println(String.format("test: %s", func1.apply(10)));
    }
}
