package pl.sii.javalambda.packageReference;

import java.util.function.DoubleFunction;

public class Main30DoubleFunction {
    public static void main(String[] args) {
        DoubleFunction<String> df = d -> d + " is now a String";
        System.out.println(df.apply(0.5));
    }

}
