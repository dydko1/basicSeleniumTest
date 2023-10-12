package pl.sii.javalambda.packageReference;

import java.util.function.DoubleConsumer;

public class Main29DoubleConsumer {
    public static void main(String[] args) {
        DoubleConsumer d = x -> System.out.println(x * x);
        d.accept(0.5);
    }
}
