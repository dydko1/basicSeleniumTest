package pl.sii.trash.ref;

import java.util.function.Function;

class Calculator {

    public static double square(Double num) {
        return Math.pow(num, 2.0);
    }

    public static double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Function<Double, Double> sq = Calculator::square;
        Double d = sq.apply(3.0);
        System.out.printf(d.toString());
    }
}