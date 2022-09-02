package testNGReporter;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class EmailReport {

    //To make it pass
    @Test(priority = 0)
    public void passTest() {
        Reporter.log("Test case passed.");
        Reporter.log("Log passed.");
        Reporter.log("***=" + getClass().getSimpleName() + "=***");
        Assert.assertTrue(true);
    }

    //To make it fail
    @Test(priority = 1)
    public void failTest() {
        Reporter.log("Test case failed.");
        Reporter.log("Log failed.");
        Assert.assertTrue(false);
    }

    //To make it skip
    @Test(priority = 2)
    public void skipTest() {
        Reporter.log("Test case skiped.");
        Reporter.log("Log skiped.");
        throw new SkipException("Skipping -This method is skipped testing ");
    }
}