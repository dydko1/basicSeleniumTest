package pl.sii.trash.lambda1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(52);

        numbers.forEach(s-> System.out.println(s));
    }
}
