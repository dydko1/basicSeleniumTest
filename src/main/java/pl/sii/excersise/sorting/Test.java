package pl.sii.excersise.sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] tab1={5,10,20};
        test1(tab1);
        int n = tab1.length;

        Arrays.stream(tab1).forEach(s-> System.out.println(s));


        for (int i = 0; i < n; i++) {
            System.out.println("ll="+tab1[i]);
        }
    }

    private static void test1(int[] a) {

        a[2]=6;
        a[1]=111;
       //a[1]=10;

    }
}
