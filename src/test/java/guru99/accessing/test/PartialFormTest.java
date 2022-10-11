package guru99.accessing.test;

import guru99.accessing.page.AccessingPage;
import guru99.accessing.page.PartialPage;
import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;

public class PartialFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        PartialPage formPage11 = new PartialPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
