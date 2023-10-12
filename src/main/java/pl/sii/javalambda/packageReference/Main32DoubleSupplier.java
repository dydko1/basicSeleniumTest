package pl.sii.javalambda.packageReference;

import java.util.function.DoubleSupplier;

public class Main32DoubleSupplier {
    public static void main(String[] args) {
        DoubleSupplier dp = () -> {
            return 0.5;
        };
        System.out.println(dp.getAsDouble());
    }
}
