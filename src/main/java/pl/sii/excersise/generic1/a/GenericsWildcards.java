package pl.sii.excersise.generic1.a;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<Double> dnts = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        dnts.add(5.0);
        dnts.add(6.0);
        double sum = sum(ints);
        System.out.println("Sum of ints=" + sum);
        System.out.println(sum(dnts));
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}