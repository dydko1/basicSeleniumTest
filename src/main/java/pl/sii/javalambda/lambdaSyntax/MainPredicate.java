package pl.sii.javalambda.lambdaSyntax;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 5;
        boolean b = predicate.test("Miro11111");
        System.out.println(b);
    }
}
