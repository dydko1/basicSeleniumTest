package pl.sii.javalambda.lambdaSyntax.d;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main09 {
    public static void main(String[] args) {
        Function<String[], List<String>> asList = Arrays::<String>asList;
        System.out.println(asList.apply(new String[]{"a", "b", "c"}));
    }
}
