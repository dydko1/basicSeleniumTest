package pl.sii.javalambda.packageReference;

import java.util.function.DoublePredicate;

public class Main31DoublePredicate {
    public static void main(String[] args) {
        DoublePredicate dp = d -> d > 500;
        System.out.println(dp.test(60.1));
    }
}
