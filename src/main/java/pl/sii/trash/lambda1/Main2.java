package pl.sii.trash.lambda1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(52, 63, 25, 24, 63);
        Consumer<Integer> method = n -> System.out.println("abc: " + n);
        numbers.forEach(method);
    }
}
