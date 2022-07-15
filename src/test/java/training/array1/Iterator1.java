package training.array1;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
