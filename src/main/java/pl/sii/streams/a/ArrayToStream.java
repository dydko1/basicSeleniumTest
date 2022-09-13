package pl.sii.streams.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mirek", "Janek", "Jas", "Wladek");
        names.stream().forEach(name -> System.out.println(name));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 55, 56);
        numbers.stream().forEach(n -> System.out.println("numer:" + (n+2
        )));

    }
}
