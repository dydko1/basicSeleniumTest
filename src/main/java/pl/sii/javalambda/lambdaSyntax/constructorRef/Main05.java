package pl.sii.javalambda.lambdaSyntax.constructorRef;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main05 {
    public static void main(String[] args) {
        Supplier<String> func1 = () -> new String();
        System.out.println("Empty string:\t" + func1.get());

        Function<String, String> func2 = str -> new String(str);
        System.out.println(func2.apply("hello"));

        Supplier<String> func3 = String::new;
        System.out.println("empty string:\t" + func3.get());

        Function<String, String> func4 = String::new;
        System.out.println(func4.apply("eeee"));


    }
}
