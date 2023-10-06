package pl.sii.javalambda.lambdaSyntax.a;


import java.util.function.Supplier;

public class BoundInstance {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> "java2s.com".length();
        System.out.println(supplier.get());

        Supplier<Integer> supplier1="Test"::length;
        System.out.println(supplier1.get());
    }
}
