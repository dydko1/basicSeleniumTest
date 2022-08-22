package pl.sii.javaBeginers.doublecolon.mykong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GFG1 {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(3, 4, 5, 6, 87, 12);
//        list.stream().map(numer -> numer * 5).forEach(System.out::println);

        List<String> list1 = Arrays.asList("msmss", "dddd", "dddd");

        List<String> upperCase = list1.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        upperCase.forEach(System.out::println);

    }
}
