package pl.sii.trash.lambda7;

import java.util.function.Function;

public class lambdaFunc1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = x -> x ^ 3;
        int result = func1.apply(10);
        System.out.println(result);
    }
}
