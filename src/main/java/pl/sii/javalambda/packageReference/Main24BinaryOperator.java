package pl.sii.javalambda.packageReference;

import java.util.function.BinaryOperator;

public class Main24BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> adder = (n1, n2) -> (n1 + n2);
        System.out.println(adder.apply(10, 40));
    }
}
