package pl.sii.javalambda.lambdaSyntax.constructorRef;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Main06 {
    public static void main(String[] args) {
        IntFunction<int[]> arrayCreator1 = size -> new int[size];

        int[] intArray1 = arrayCreator1.apply(5);
        System.out.println(Arrays.toString(intArray1));

        IntFunction<int[]> arrayCreator2 = int[]::new;
        int[] intArray2 = arrayCreator2.apply(10);
        System.out.println(Arrays.toString(intArray2));
    }
}
