package pack1;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnGroups12 {
    @Test(description = "This is testcase 111 desc", groups = {"funca"})
    @Parameters("myName")
    public void test1(String myName) {
        String browser = System.getProperty("browser", "chrome");
        if(browser==null)
            System.out.println("Empty");
            System.out.println("eee="+browser);

        System.out.println("Message1: This is testcase1 desc. \tfunc\tsanity:****\t"+myName );
        Assert.assertEquals("a","a");
    }

}
