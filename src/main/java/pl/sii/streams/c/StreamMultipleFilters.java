package pl.sii.streams.c;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.function.IntConsumer;

public class StreamMultipleFilters {
    public static void main(String[] args) {

        int[] inums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        IntConsumer icons = i -> System.out.println(i + " ");
        Arrays.stream(inums).filter(e->e<6 ||e>10).filter(e->e%2==0).forEach(icons);

    }
}
