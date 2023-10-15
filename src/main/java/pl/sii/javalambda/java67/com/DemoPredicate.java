package pl.sii.javalambda.java67.com;

import pl.sii.javalambda.functionalInterface.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("1", "Alpha", 60),
                new User("2", "Beta", 50),
                new User("3", "Gama", 40),
                new User("4", "Becca", 30),
                new User("5", "Tesla", 20),
                new User("6", "Noob", 10)
        );

        System.out.println(userList);

        List<User> above35 = userList.stream().filter(isOver35()).collect(Collectors.toList());
        System.out.println("---:\t" + above35);
        List<User> nameWithB = userList.stream().filter(nameStartWithB()).collect(Collectors.toList());
        System.out.println(nameWithB);
        List<User> nameStartsWithBorA = userList.stream().filter(nameStartsWithBorA()).collect(Collectors.toList());
        System.out.println(nameStartsWithBorA);

    }

    private static Predicate<User> isOver35() {
        return p -> p.getAge() > 35;
    }

    private static Predicate<User> nameStartWithB() {
        return u -> u.getName().startsWith("B");
    }

    // Predicate to find all users whose name starts with B or A
    private static Predicate<User> nameStartsWithBorA() {
        return p -> p.getName().startsWith("B")
                || p.getName().startsWith("A");
    }
}