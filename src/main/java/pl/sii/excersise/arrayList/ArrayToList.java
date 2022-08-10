package pl.sii.excersise.arrayList;

import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {

        // create an ArrayList
        Integer a[] = new Integer[]{10, 20, 30, 20, 20, 20, 40};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(a)); //new ArrayList<>();
        //numbers.addAll(Arrays.asList(a));


        // add element to ArrayList
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        System.out.println("ArrayList: " + numbers);

        HashSet<Integer> set = new HashSet<>();
        set.add(20);

        numbers.removeAll(set);

        //System.out.println("ArrayList: " + numbers);

        String[] s = new String[]{"a", "b", "c", "d"};
        List<String> aS = new ArrayList<>(Arrays.asList(s));
//        aS.remove("a");
        //aS.toArray(a);
        System.out.println(aS);
    }
}
