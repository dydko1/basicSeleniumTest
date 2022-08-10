package training.array1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInt {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(8);
        numbers.add(2);

        Iterator<Integer> it1= numbers.iterator();

        while (it1.hasNext())
            System.out.println(it1.next());
    }
}
