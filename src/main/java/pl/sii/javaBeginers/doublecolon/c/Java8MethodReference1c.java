package pl.sii.javaBeginers.doublecolon.c;

import java.util.function.BiFunction;

public class Java8MethodReference1c {
    public static void main(String[] args) {
        String result1 = playTwoArgument(8, 3, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) {
                return IntUtils.join(integer, integer2);
            }
        });                                                                   // 3
        System.out.println(result1);

        String r2 = playTwoArgument(1, 2, (a, b) -> IntUtils.join(a, b));
        System.out.println(r2);

        String r3=playTwoArgument(10,45,IntUtils::join);
        System.out.println(r3);
    }

    private static <R> R playTwoArgument(Integer i1, Integer i2, BiFunction<Integer, Integer, R> func1) {
        return func1.apply(i1, i2);
    }
}
