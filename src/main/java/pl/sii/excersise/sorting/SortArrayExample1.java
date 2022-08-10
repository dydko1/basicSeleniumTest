package pl.sii.excersise.sorting;

import net.bytebuddy.matcher.FilterableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayExample1 {
    public static void main(String[] args) {
        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
        List<Integer> list1 = Arrays.asList(90, 23, 5, 109, 12, 22, 67, 34);
        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }

        list1.stream().sorted().forEach(s -> System.out.println("xx=" + s));
    }
}
