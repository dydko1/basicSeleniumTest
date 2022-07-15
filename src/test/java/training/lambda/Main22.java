package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main22 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 3, 6, 8, 3);

        Consumer<Integer> met = n -> System.out.println(n);
        list.forEach(met);
    }
}
