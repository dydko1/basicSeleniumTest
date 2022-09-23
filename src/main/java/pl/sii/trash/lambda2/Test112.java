package pl.sii.trash.lambda2;

import java.util.ArrayList;

public class Test112 {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(10);
        arrL.add(15);
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(System.out::println);
        System.out.println("-----------------");
        arrL.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);;
        });
    }
}
