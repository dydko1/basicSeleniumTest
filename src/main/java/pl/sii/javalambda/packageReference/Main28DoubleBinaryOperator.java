package pl.sii.javalambda.packageReference;

import java.util.function.DoubleBinaryOperator;

public class Main28DoubleBinaryOperator {
    public static void main(String[] args) {
        DoubleBinaryOperator d = (x, y) -> x * y;
        System.out.println(d.applyAsDouble(0.2,0.2));
    }
}
