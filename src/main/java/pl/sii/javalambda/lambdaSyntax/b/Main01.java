package pl.sii.javalambda.lambdaSyntax.b;

import java.util.function.Consumer;

public class Main01 {
    public static void main(String[] args) {
        Util01 util = new Util01();

        Consumer<String> consumer = str -> util.print01(str);
        consumer.accept("Hello");

        Consumer<String> consumer1=util::print01;
        consumer1.accept("java2s.com");

        util.debug01();
    }
}
