package pl.sii.streams.c;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterRemoveNulls {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null, "forest",
                "sky", "book", null, "theatre");

        List<String> result=words.stream().filter(w->w!=null).collect(Collectors.toList());
        result.forEach(s-> System.out.println(s));

    }
}
