package test6.function1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Geek {

    @Test
    public void test1() {
        Function<Integer, Double> half = a -> (a / 2.);
        half = half.compose(x -> x * 10);
        System.out.println(half.apply(50));
    }

    @Test
    public void test2() {
        Function<String, Integer> func = String::length;
        System.out.println("length: \t" + func.apply("Miro"));
    }

    @Test
    public void test3() {
        Function<String, Integer> length = String::length;
        Function<Integer, Integer> func2 = x -> x * 10;
        System.out.println(length.andThen(func2).apply("Miro"));
    }

    @Test
    public void test4() {
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

    }


}
