package pl.sii.javalambda.lambdaSyntax.constructorRef;

import java.util.Arrays;
import java.util.function.Function;

public class Main07 {
    public static void main(String[] args) {
        Function<Integer, int[]> arrayCreator3 = int[]::new;
        int[] intArray=arrayCreator3.apply(10);
        System.out.println(Arrays.toString(intArray));
    }
}
