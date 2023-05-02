package pl.sii.trash.lambda7;

import java.util.function.Consumer;

public class Lambda7Consumer {
    static void print1(String text) {
        System.out.println("My text is: " + text);
    }

    public static void main(String[] args) {
        Consumer<String> consumer1 = a -> print1("Consmumer " + a);
        consumer1.accept("Miro");
    }
}
