package pl.sii.excersise.generic1.a;

public class MaximumTest {
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max1 = x;
        if (y.compareTo(max1) > 0)
            max1 = y;
        if (z.compareTo(max1) > 0)
            max1=z;

            return max1;
    }

    public static void main(String args[]) {
        System.out.println(max(1,40,5));
        System.out.println(max( 6.6, 8.8, 7.7 ));

    }
}