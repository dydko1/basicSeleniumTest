package pl.sii.trash.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supplier01 {
    @Test
    public void supplier01() {
        Supplier<Double> doubleSupplier = () -> Math.random();
        DoubleSupplier doubleSupplier1 = Math::random;
        System.out.println(doubleSupplier.get());
        System.out.println(doubleSupplier1.getAsDouble());
    }

    @Test
    public void supplierWithOptional() {
        Supplier<Double> doubleSupplier = () -> Math.random();
        Optional<Double> optionalDouble = Optional.empty();
        System.out.println(optionalDouble.orElseGet(doubleSupplier));
    }

    @Test
    public void testPredicate() {
        List<String> names = Arrays.asList("Miro", "Sam", "Seba", "Ernest");
        Predicate<String> nameStartsWithS = n -> n.startsWith("S");
        names.stream().filter(nameStartsWithS).forEach(System.out::println);
    }
}
