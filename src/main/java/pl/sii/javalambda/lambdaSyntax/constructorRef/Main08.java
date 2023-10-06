package pl.sii.javalambda.lambdaSyntax.constructorRef;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Main08 {
    public static void main(String[] args) {
        IntFunction<int[][]> twoDimension = int[][]::new;
        int[][] intArray = twoDimension.apply(5);
        intArray[0] = new int[5];
        intArray[1] = new int[5];
        intArray[2] = new int[5];
        intArray[3] = new int[5];
        intArray[4] = new int[5];

        System.out.println(Arrays.deepToString(intArray));
    }
}
