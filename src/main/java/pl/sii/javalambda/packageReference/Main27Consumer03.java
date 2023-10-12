package pl.sii.javalambda.packageReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main27Consumer03 {
    public static void main(String[] args) {
        List<Student27> student27s = Arrays.asList(
                new Student27("Miro", 20.0),
                new Student27("Miro2", 31.0)
        );


        acceptAllEmployees(student27s, e -> System.out.println(e.getName()));
        acceptAllEmployees(student27s, e -> System.out.println(e.getName() + "\t" + e.getGpa()));
    }

    public static void acceptAllEmployees(List<Student27> student27s, Consumer<Student27> printer) {
        for (Student27 e : student27s) {
            printer.accept(e);
        }
    }
}
