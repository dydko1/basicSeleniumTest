package pl.sii.trash.lambda7;

import java.util.function.Supplier;

public class lambda7Func2Consumer {
    static String print(Supplier<String> text) {
        return (text.get()+" ");
    }

    public static void main(String[] args) {
        String x = print(() -> "Hello");
        x += print(() -> "World");
        System.out.println(x);
    }
}
