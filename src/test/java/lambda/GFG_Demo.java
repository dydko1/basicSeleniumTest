package lambda;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class GFG_Demo {
    public static void main(String[] args) {
        int arr_sample1[] = {11, 2, 3, 42, 5, 6, 17, 8, 9,
                10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20};
        System.out.println("These method returns Optional");
        System.out.println(Arrays.stream(arr_sample1).average());
    }
}
