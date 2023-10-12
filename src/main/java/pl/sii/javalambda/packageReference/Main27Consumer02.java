package pl.sii.javalambda.packageReference;

import java.util.function.Consumer;

public class Main27Consumer02 {
    public static void main(String[] args) {
        int x = 99;
        Consumer<Integer> myConsumer = y -> {
            System.out.println("x=\t" + x);
            System.out.println("y=\t" + y);
        };

        myConsumer.accept(50);
    }
}
