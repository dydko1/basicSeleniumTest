package pl.sii.javalambda.expression;

import java.util.function.Function;

public class Main09 {
    public Main09() {
        Function<String, String> func1 = x -> {
            System.out.println("Tu był Miro:\t" + this);
            return x;
        };
        System.out.println(func1.apply(""));
    }

    public String toString() {
        return "Main!";
    }

    public static void main(String[] args) {
        new Main09();
    }
}
