package pl.sii.javalambda.packageReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//www . ja va  2  s .c om
public class Main35Predicate03 {
   public static void main(String[] args) {
      List<Student35> employees = Arrays.asList(
              new Student35(1, 3, "John"),
              new Student35(2, 3, "Jane"),
              new Student35(3, 4, "Jack")
      );

      // with predicate
      System.out.println(findStudents(employees, createCustomPredicateWith(10_000)));

      // with function definition, both are same
      Function<Double, Predicate<Student35>> customFunction = threshold1 -> (e1 -> e1.gpa > threshold1);
      System.out.println(findStudents(employees, customFunction.apply(10_000D)));
   }

   private static Predicate<Student35> createCustomPredicateWith(double threshold) {
      return e -> e.gpa > threshold;
   }

   private static List<Student35> findStudents(List<Student35> employees, Predicate<Student35> condition) {
      List<Student35> result = new ArrayList<>();

      for (Student35 e : employees) {
         if (condition.test(e)) {
            result.add(e);
         }
      }

      return result;
   }

}