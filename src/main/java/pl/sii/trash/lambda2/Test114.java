package pl.sii.trash.lambda2;

import java.util.logging.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test114 {
    public static void main(String[] args) {
        Predicate<String> nonNull = s -> s != null;
        System.out.println(nonNull.test(null));

        Predicate<String> nonEmpty = s -> !s.isEmpty();
        System.out.println(nonEmpty.test(""));

        Predicate<String> shorterTha5 = s -> s.length() <= 5;
        System.out.println(shorterTha5.test("ddddde"));

        Predicate<String> p = nonNull.and(nonEmpty).and(shorterTha5);

        System.out.println("x=" + p.test(""));
        System.out.println("--------------------------------------");

        Predicate<Collection<String>> isEmpty1 = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty1);
        List<String> ss= Arrays.asList("aa","bb","cc");
        System.out.println("--------------------------------------");
        System.out.println(isNotEmpty.test(ss));

        Logger logger = Logger.getLogger("MyApplicationLogger");
        Consumer<String> log = message -> logger.info(message);
        Consumer<String> print = message -> System.out.println(message);

        Consumer<String> printAndLog = log.andThen(print);
    }
}
