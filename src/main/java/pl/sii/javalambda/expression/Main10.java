package pl.sii.javalambda.expression;

import java.util.function.Function;

public class Main10 {
    public Main10() {
        //int x=0;
        Function<String, String> func1 = x -> {
            System.out.println(this);
            return x;
        };
        System.out.println(func1.apply("LL"));
    }

    @Override
    public String toString() {
        return "Tu był Miro!!";
    }

    public static void main(String[] args) {
        new Main10();
    }
}
