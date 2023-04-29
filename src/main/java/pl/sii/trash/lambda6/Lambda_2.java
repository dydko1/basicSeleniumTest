package pl.sii.trash.lambda6;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public class Lambda_2 {
    List<Person> persons =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));

    @Test
    public void test_01() {
        List<Person> personList = persons
                .stream()
                .filter(p -> p.name.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(personList);
    }

    @Test
    public void test_02() {
        Map<Integer, List<Person>> personByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        System.out.println("---------------");
        Double ave = persons.stream().collect(Collectors.averagingDouble(p -> p.age));
        System.out.println(ave);
    }

    @Test
    public void test_03() {
        IntSummaryStatistics ageSummary =
                persons
                        .stream()
                        .collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(ageSummary);
    }

    @Test
    public void test_04() {
        String phrase = persons
                .stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);
    }

    @Test
    public void test_05() {
        Map<Integer, String> map1 = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age + 5,
                        p -> p.name + "AA",
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println(map1);
    }

    @Test
    public void test_06() {
        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),
                        (j, p) -> j.add(p.name.toUpperCase()),
                        (j1, j2) -> j1.merge(j2),
                        StringJoiner::toString);
        String names = persons
                .stream()
                .collect(personNameCollector);

        System.out.println(names);
    }

    @Test
    public void test_07() {
        Person result = persons
                .stream()
                .reduce(new Person("", 0), (p1, p2) -> {
                    p1.age += p2.age;
                    p1.name += p2.name;
                    return p1;
                });
        System.out.println(result);
    }

    @Test
    public void test_08() {
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
