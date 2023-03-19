package pl.sii.trash.lambda6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda_1 {
    List<String> myList;

    @Test
    public void test_01() {
        myList = Arrays.asList("a1", "a2", "a3", "a4", "zc5", "a1");

        myList
                .stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    public void test_02() {
        Stream s;
        Stream<String> aa = Arrays.asList("a1", "a2", "a3")
                .stream()
                .filter(ss -> ss.contains("a"));
        //.ifPresent(System.out::println);
//                .filter(s1 -> s1.contains("a"))
//                .map(String::toUpperCase)
//                .forEach(s2 -> System.out.println(s2));
    }

    @Test
    public void test_03() {
        Arrays.stream(new int[]{100, 2})
                .map(n -> 2 * n)
                .average()
                .ifPresent(System.out::println);
    }

    @Test
    public void test_04() {
        Stream.of("a1", "a2", "a3", "a4")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

    @Test
    public void test_05() {
        Stream.of("d1", "d2", "d3", "d4")
                .filter(s -> {
                    System.out.println("Filter.:" + s);
                    return true;
                })
                .forEach(s -> System.out.println("foreach.:" + s));
    }

    @Test
    public void test_06() {
        Stream.of("1xxx", "ax2", "b1", "b3", "Ac", "ssssA")
                .map(s -> {
                    System.out.println("map.: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }

    @Test
    public void test_07() {
        Stream.of("d2", "a2", "b1", "b3", "ac")
                .filter(s -> {
                    System.out.println("filter.: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map.: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach.: " + s));
    }
}
