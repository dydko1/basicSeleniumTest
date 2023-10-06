package pl.sii.javalambda.packageReference;

import java.util.function.BiFunction;

public class Main20 {
    public static void main(String[] args) {
        BiFunction<String, String, String> bi1 = (x, y) -> {
            return x + y;
        };

        System.out.println(bi1.apply("xxxx","ffff"));
    }
}
