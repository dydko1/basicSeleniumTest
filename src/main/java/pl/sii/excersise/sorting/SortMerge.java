package pl.sii.excersise.sorting;

import java.util.Arrays;

public class SortMerge {
    public static void main(String[] args) {
        int[] actual = new int[]{-300, 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65, -1000};

        mergeSort(actual);

        Arrays.stream(actual).forEach(s -> System.out.println(s));
    }

    private static void mergeSort(int[] a) {
        int n = a.length;

        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = a[i];

        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];

        mergeSort(l);
        mergeSort(r);

        merge(a, l, r);

    }

    private static void merge(int[] a, int[] l, int[] r) {

        int i = 0, j = 0, k = 0;
        int left = l.length;
        int right = r.length;

        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        while (i<left)
            a[k++]=l[i++];

        while (j<right)
            a[k++]=r[j++];

    }
}
