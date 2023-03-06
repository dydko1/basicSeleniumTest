package pl.sii.trash.function;

import java.util.function.Function;

public class Java8Function1 {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        Integer apply = function.apply("test1");
        System.out.println("Długośc napisu.:" + apply);
    }
}
