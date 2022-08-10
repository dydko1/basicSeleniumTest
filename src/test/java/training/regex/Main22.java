package training.regex;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Main22 {
    public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";

    public static final String EXAMPLE_TEST1 = "euyuy";

    public static void main(String[] args) {
        StringMatcher stringMatcher = new StringMatcher();
        System.out.println("Output:\t" + stringMatcher.isAnimal(EXAMPLE_TEST1));

    }
}