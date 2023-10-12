package pl.sii.javalambda.packageReference;

import java.util.function.Consumer;

public class Main27Consumer01 {
    public static void main(String[] args) {
        Consumer<String> c = x -> System.out.println(x.toUpperCase());
        c.accept("ncdjj");
    }
}
