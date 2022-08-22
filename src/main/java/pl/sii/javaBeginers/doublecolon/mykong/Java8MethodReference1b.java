package pl.sii.javaBeginers.doublecolon.mykong;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8MethodReference1b {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3");

        // anonymous
        List<Integer> col1 = list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).collect(Collectors.toList());
        col1.forEach(System.out::println);

        List<Integer> col2=list.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        col2.forEach(System.out::println);

        List<Integer> col3=list.stream().map(Integer::parseInt).collect(Collectors.toList());
        col3.forEach(s-> System.out.println(s+10));


    }

}