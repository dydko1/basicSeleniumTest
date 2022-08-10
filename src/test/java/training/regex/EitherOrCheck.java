package training.regex;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class EitherOrCheck {
    @Test
    public void testSimpleTrue() {
        String s = "humbapumpa jim";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbapumpa jidmd jdoe";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbaPumpa joe";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbapumpa joe jim";
        System.out.println(s.matches(".*(jim|joe).*"));
    }
}