package training.regex;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckPhone {

    @Test
    public void testSimpleTrue() {
        String pattern = "\\d\\d\\d([,\\s])?\\d\\d\\d\\d";
        String s= "1233323";
        System.out.println(s.matches(pattern));
        s = "1233323";
        System.out.println(s.matches(pattern));
        s = "123 3323";
        System.out.println(s.matches(pattern));
    }
}