package pl.sii.streams.c;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {
    public static void main(String[] args) {
        List<String> words = List.of("pen", "custom", "orphanage", "forest", "bubble", "butterfly");

        List<String> result=words.stream().filter(w->(w.length()>50)).collect(Collectors.toList());

        result.forEach(s-> System.out.println(s));
    }
}
