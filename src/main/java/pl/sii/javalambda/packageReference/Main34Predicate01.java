package pl.sii.javalambda.packageReference;

import java.util.function.Predicate;

public class Main34Predicate01 {
    public static void main(String[] args) {
        Predicate<String> i = s -> s.length() > 10;
        System.out.println(i.test("hhhhhhhhhhhhhhhhhhhhhhhhhhh"));
    }
}
