package pl.sii.trash.lambda4;

import java.util.ArrayList;
import java.util.List;

public class GFG3 {
    public static void main(String[] args) {
        List<Test125> list = new ArrayList<Test125>();
        list.add(new Test125("Geeks"));
        list.add(new Test125("For"));
        list.add(new Test125("GEEKS"));

        list.forEach(Test125::someFunction);
    }
}
