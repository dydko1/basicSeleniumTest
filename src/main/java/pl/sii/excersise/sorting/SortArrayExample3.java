package pl.sii.excersise.sorting;

import org.jetbrains.annotations.NotNull;

public class SortArrayExample3 {

    public static void main(String[] s) {
        int array[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
        System.out.print("Array elements before sorting: \n");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        sortArray(array);
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void sortArray(int[] array2) {
        int n = array2.length;

        for (int i = 0; i < n; i++) {
            int tmp = array2[i];
            int j = i;
            while ((j > 0) && (array2[j - 1] > tmp)) {
                array2[j] = array2[j - 1];
                j--;
            }
            array2[j] = tmp;
            System.out.println("---------");
        }

    }
}
