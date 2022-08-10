package training.lambda2.advance1;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample07 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mirek", "Janek", "Zbyszek", "Benek");

        names.forEach(n -> System.out.println("Names list: " + n));
    }
}
