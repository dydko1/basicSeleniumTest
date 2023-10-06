package pl.sii.javalambda.packageReference;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main23 {
    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(1D, 2D, 3D);
        System.out.println(transferNumbers(numbers, Math::pow));
    }

    private static List<String> transferNumbers(List<Double> numbers, BiFunction<Double, Double, Double> fx) {
        List<String> appliedNumbers = new ArrayList<>();
        for (Double n : numbers) {
            appliedNumbers.add(String.valueOf(fx.apply(n, n)));

        }
        return appliedNumbers;
    }
}
