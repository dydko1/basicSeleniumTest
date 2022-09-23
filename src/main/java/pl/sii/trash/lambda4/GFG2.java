package pl.sii.trash.lambda4;

import java.util.ArrayList;
import java.util.List;

public class GFG2 {
     void someFunction(String s) {
        System.out.println("test123:\t" + s);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        list.forEach(new GFG2()::someFunction);
    }
}
