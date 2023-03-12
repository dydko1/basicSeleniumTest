package pl.sii.trash.function;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Consumer01 {
    @Test
    public void whenNamesPresentConsumerAll() {
        Consumer<String> printCities = s -> System.out.println("Moje miasta:" + s);
        List<String> cities = List.of("Katowice", "Lublin", "Ruda Sl.");
        cities.forEach(printCities);
    }

    @Test
    public void whenNamesPresentBothConsumer() {
        List<String> cities = Arrays.asList("Małe Miasto", "Ruda Sl", "Katowice");

        Consumer<List<String>> upperCases = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase() + "test");
            }
        };

        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

        upperCases.andThen(printConsumer).accept(cities);
    }
}