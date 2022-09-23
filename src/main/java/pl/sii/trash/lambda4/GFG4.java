package pl.sii.trash.lambda4;

import java.util.ArrayList;
import java.util.List;

public class GFG4 {
    public GFG4(String s) {
        System.out.println("abc:\t" + s);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        list.forEach(GFG4::new);
    }
}
