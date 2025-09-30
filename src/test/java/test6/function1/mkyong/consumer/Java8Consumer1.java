package test6.function1.mkyong.consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class Java8Consumer1 {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase(Locale.ROOT));
        cons.accept("xxxxx");
    }
}
