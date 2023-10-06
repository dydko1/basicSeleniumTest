package pl.sii.javalambda.packageReference;

import java.util.function.BiFunction;

public class Calculator21 {
    public String calc(BiFunction<Integer, Integer, String> bi, int a, int b) {
        return bi.apply(a, b);
    }
}
