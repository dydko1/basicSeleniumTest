package test6.function1.mkyong.consumer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Java8Consumer2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> consumer = System.out::println;
        forEach1(list, consumer);
        System.out.println("--------------");
        forEach1(list, x -> System.out.println(x * x * x));
    }

    static <T> void forEach1(List<T> l1, Consumer<T> c1) {
        for (T t : l1)
            c1.accept(t);
    }
}
