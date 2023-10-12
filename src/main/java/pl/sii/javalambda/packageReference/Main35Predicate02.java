package pl.sii.javalambda.packageReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main35Predicate02 {
    public static void main(String[] args) {
        List<Box35> inventory = Arrays.asList(
                new Box35(80, "green"),
                new Box35(155, "green"),
                new Box35(120, "red"));

        List<Box35> greenApples = filter1(inventory, Main35Predicate02::isGreenApple);
        System.out.println(greenApples);

        List<Box35> heavyApples = filter1(inventory, Main35Predicate02::isHeavyApple);
        System.out.println(heavyApples);

        List<Box35> greenApples2 = filter1(inventory, (Box35 x) -> "green".equals(x.getColor()));
        System.out.println(greenApples2);

        List<Box35> heavyApples2 = filter1(inventory, (Box35 a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        List<Box35> weirdApples = filter1(inventory, (Box35 a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
        System.out.println(weirdApples);
    }

    public static boolean isGreenApple(Box35 apple) {
        return "green".equals(apple.getColor());

    }

    public static boolean isHeavyApple(Box35 apple) {
        System.out.println("kkkkk=\t" + apple.getColor());
        return apple.getWeight() > 150;
    }

    public static List<Box35> filter1(List<Box35> inventory, Predicate<Box35> p) {
        List<Box35> result = new ArrayList<>();
        for (Box35 apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
