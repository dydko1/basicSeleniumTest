package training.array1;

import java.util.HashMap;
import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("BMW");

        cars.add("Ford");

        cars.add("BMW");

        System.out.println(cars);

    }
}
