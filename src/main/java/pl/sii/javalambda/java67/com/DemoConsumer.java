package pl.sii.javalambda.java67.com;

import pl.sii.javalambda.functionalInterface.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("1", "Alpha", 60),
                new User("2", "Beta", 50),
                new User("3", "Gama", 40),
                new User("4", "Becca", 30),
                new User("5", "Tesla", 20),
                new User("6", "Noob", 10)
        );

        Consumer<List<User>> consumerUser1 = u -> System.out.println(u);
        consumerUser1.accept(userList);

        Consumer<User> userConsumer2 = u -> System.out.println(u);
        userList.forEach(userConsumer2);

        System.out.println(":::::::::::::::::::::::::::::::::::");
        Consumer<User> userA = funU1 -> System.out.println(funU1.getName().toLowerCase());
        Consumer<User> userB = funU2 -> System.out.println(funU2.getName().toUpperCase());

        Consumer<User> result = userA.andThen(userB);
        User newUser = new User("23", "Miro", 123);
        result.accept(newUser);


    }
}
