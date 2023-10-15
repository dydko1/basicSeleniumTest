package pl.sii.javalambda.java67.com;

import pl.sii.javalambda.functionalInterface.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DemoFunctional {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("1", "Alpha", 60),
                new User("2", "Beta", 50),
                new User("3", "Gama", 40),
                new User("4", "Becca", 30),
                new User("5", "Tesla", 20),
                new User("6", "Noob", 10)
        );

        Function<List<User>, Integer> listSize = userList1 -> userList1.size();
        System.out.println(listSize.apply(userList));
    }
}
