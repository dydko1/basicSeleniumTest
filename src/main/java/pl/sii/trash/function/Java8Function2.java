package pl.sii.trash.function;

import java.util.function.Function;

public class Java8Function2 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * x;

        Integer result = func1.andThen(func2).apply("test");
        System.out.println("Wynik.:" + result);
    }
}
