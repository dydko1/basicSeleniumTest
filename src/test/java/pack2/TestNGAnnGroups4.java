package pack2;

import org.testng.Assert;
import org.testng.IReporter;
import org.testng.annotations.Test;

public class TestNGAnnGroups4 implements IReporter {
    @Test(description = "Login passed by email", groups = {"myAnnotation"})
    public void testpass() {
        System.out.println("Message 1200, \tlogin passed - miro");
        Assert.assertTrue(true);
    }

    @Test(description = "Login failed by email",groups = {"myAnnotation"})
    public void testfail() {
        System.out.println("Message 1201,\t login failed - miro");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = { "testfail" })
    public void methodSkip() {
        System.out.println("Helloo.. Im in method skip");
    }

}
