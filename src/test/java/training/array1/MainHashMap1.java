package training.array1;

import java.util.HashMap;

public class MainHashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> nameLastName = new HashMap<>();

        nameLastName.put("Mirek","Dyduch");
        nameLastName.put("Leszek","B");
        nameLastName.put("aDaniel","Z");
        nameLastName.put("aDaniel","Z");
        nameLastName.put("aDaniel","Z");
        // Print keys
        for (String i : nameLastName.keySet()) {
            System.out.println(i);
        }
    }
}
