package pl.sii.javaBeginers.doublecolon.mykong2.a;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodProvider {
    static <R1> R1 playOneArgument(String s1, Function<String, R1> function) {
        return function.apply(s1);
    }

    static Boolean playTwoArguments(String s1, String s2, BiPredicate<String, String> func2) {
        return func2.test(s1, s2);
    }
}
