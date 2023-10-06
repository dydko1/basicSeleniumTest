package pl.sii.javalambda.lambdaSyntax.b;

import java.util.function.BiFunction;

public class Main03 {
    public static void main(String[] args) {
        BiFunction<String, String, String> strFunc = Util02::append1;
        String name = "Miro";
        String s = strFunc.apply(name, "EEE");
        System.out.println(s);
    }
}
