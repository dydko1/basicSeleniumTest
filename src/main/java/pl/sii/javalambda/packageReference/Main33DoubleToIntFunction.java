package pl.sii.javalambda.packageReference;

import java.util.function.DoubleToIntFunction;

public class Main33DoubleToIntFunction {
    public static void main(String[] args) {
        DoubleToIntFunction df = x -> {
            return (int) x^2;
        };

        System.out.println(df.applyAsInt(1.6));
    }
}
