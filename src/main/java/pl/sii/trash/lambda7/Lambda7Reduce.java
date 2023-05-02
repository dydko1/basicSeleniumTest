package pl.sii.trash.lambda7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lambda7Reduce {
    public static void main(String[] args) {
        int[] array = {2, 4, 8};

        IntStream intStream = Arrays.stream(array);

        int total = intStream.reduce(0, (a, b) -> a + b);

        System.out.println(total);
    }
}
