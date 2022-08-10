package pl.sii.excersise.arrayList;

import java.util.Arrays;

public class InserPos {
    public static void main(String[] s) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6};
        int n = tab.length;

        int pos = 4;
        pos--;

        for (int i = 0; i < n; i++) {
            if (i == pos) {
                tab[i] = 60;
            }
        }

        System.out.println("xxx" + Arrays.toString(tab));

        Arrays.stream(tab).forEach(s1 -> System.out.println(s1));
    }
}
