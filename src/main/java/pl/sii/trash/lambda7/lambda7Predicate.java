package pl.sii.trash.lambda7;

import java.util.ArrayList;

public class lambda7Predicate {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("onur");
        arrayList.add("swtestaconurademy");
        arrayList.add("testing");
        arrayList.add("automation");
        //Print the array list before remove operation.
        System.out.println(arrayList.toString());

        System.out.println("--------------------------");
        arrayList.removeIf(a->a.contains("onur"));
        System.out.println(arrayList);
    }
}
