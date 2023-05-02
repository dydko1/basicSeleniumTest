package pl.sii.trash.lambda7;

import org.openqa.selenium.StaleElementReferenceException;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamReduceIntegerSumExample {
    public static void main(String[] args) {
        int[] array = {8, 9, 10};
        IntStream intStream = Arrays.stream(array);
        //Reduce and Integer::sum
        int total = intStream.reduce(0, Integer::sum);
        System.out.println(total);
    }
}