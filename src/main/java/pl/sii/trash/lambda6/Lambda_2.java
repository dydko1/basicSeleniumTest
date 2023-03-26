package pl.sii.trash.lambda6;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
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
}
