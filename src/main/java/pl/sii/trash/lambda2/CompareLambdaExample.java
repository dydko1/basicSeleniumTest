package pl.sii.trash.lambda2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mirek", "Arek", "Daniel", "Waclal");

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        names.forEach(s-> System.out.println(s));
    }
}
