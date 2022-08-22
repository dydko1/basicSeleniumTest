package pl.sii.javaBeginers.doublecolon.mykong;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintList {
    public static void main(String[] args) {
        List<String> titles= Arrays.asList("node", "java", "python", "ruby");

        titles.forEach(System.out::println);

    }
}
