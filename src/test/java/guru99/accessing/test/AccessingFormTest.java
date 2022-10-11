package guru99.accessing.test;

import guru99.accessing.page.AccessingPage;
import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;

public class AccessingFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        AccessingPage formPage11 = new AccessingPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
