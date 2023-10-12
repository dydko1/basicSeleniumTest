package pl.sii.javalambda.packageReference;

import java.util.function.BiPredicate;

public class Main25BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
        System.out.println(bi.test(20,3));
    }
}
