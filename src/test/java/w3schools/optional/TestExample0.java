package w3schools.optional;

import java.util.Optional;

public class TestExample0 {
    public static void main(String args[]) {
        String[] str = new String[10];
        str[4] = "dddddddddddddddd";

        Optional<String> checkNull = Optional.ofNullable(str[4]);

        if (checkNull.isPresent()) {
            String lowerCase = str[4].toLowerCase();
            System.out.println(lowerCase);
        } else
            System.out.println("String value is not present");
    }
}