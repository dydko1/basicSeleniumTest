package pl.sii.trash.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function01 {
    @Test
    public void testFunctions() {
        List<String> names = Arrays.asList("Miro", "Smith", "Gourav", "Header");
        Function<String, Integer> nameMapping = String::length;
        List<Integer> nameLength=names.stream().map(nameMapping).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
