package pl.sii.javalambda.lambdaSyntax.b;

import java.util.function.Function;

public class Main02 {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;
        String name = "Miro";
        int len = strLength.apply(name);
        System.out.println("name  = " + name + ", length = " + len);

        name = "Miro2";
        len = strLength.apply(name);
        System.out.println("name  = " + name + ", length = " + len);
    }
}
