package pl.sii.excersise.sorting;

import java.util.Arrays;

public class SortArrayExample2 {
    public static void main(String[] args) {
        int[] array = new int[]{-67, 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        System.out.println("Array elements after sorting:");

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
        Arrays.stream(array).forEach(n -> System.out.println(n));
    }
}
