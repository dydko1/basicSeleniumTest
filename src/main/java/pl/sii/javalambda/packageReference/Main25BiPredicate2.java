package pl.sii.javalambda.packageReference;

import java.util.function.BiPredicate;

public class Main25BiPredicate2 {
    public static void main(String[] args) {

        BiPredicate biPre = (a, b) -> {
            return a.equals(b);
        };
        boolean result = compare((a, b) -> a / 2 == b + 1, 12, 5);
        System.out.println(result);
    }

    public static boolean compare(BiPredicate<Integer, Integer> bi, Integer i1, Integer i2) {
        return bi.test(i1, i2);
    }
}
