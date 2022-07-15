package training.array1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainArray1 {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        cars.add("cBMW");
        cars.add("aVOLVO");
        cars.add("bFord");
        cars.add("dMazda");

        for (String s : cars) {
            System.out.println(s);
        }

        cars.remove("dMazda");
        Collections.sort(cars);
        System.out.println("-----");
        for (String s : cars) {
            System.out.println(s);
        }
    }
}
