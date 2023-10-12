package pl.sii.javalambda.packageReference;

import java.util.function.BooleanSupplier;

public class Main26BooleanSupplier {
    public static void main(String[] args) {
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());

        int x = -1, y = 0;
        bs = () -> x > y;
        System.out.println(bs.getAsBoolean());
    }
}
