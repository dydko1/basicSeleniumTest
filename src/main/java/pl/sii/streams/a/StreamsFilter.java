package pl.sii.streams.a;

import java.util.Arrays;
import java.util.List;

public class StreamsFilter {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList("You", "We", "shall", "noon");

        texts.stream().filter(s -> s.length() >= 3).forEach(s -> System.out.println(s));
    }
}
