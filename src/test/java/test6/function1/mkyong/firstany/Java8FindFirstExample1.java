package test6.function1.mkyong.firstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindFirstExample1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 8, 3, 2, 1);

        Optional<Integer> first = list.stream().findFirst();
        if (first.isPresent()) {
            Integer result = first.get();
            System.out.println(result);       // 1
        } else {
            System.out.println("no value?");
        }

        Optional<Integer> first2 = list
                .stream()
                .filter(x -> x > 1).findFirst();

        if (first2.isPresent()) {
            System.out.println(first2.get()); // 2
        } else {
            System.out.println("no value?");
        }
    }

}