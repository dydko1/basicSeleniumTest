package pl.sii.trash.lambda7;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Lambda7Filter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = Arrays.stream(array);

        OptionalDouble average = intStream.filter(v -> v > 8).average();
        System.out.println(average);

        System.out.println("--------------------");
        average.ifPresent(System.out::println);
        System.out.println(average.isEmpty());

    }
}
