package zUdemy.section05.test;

import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;
import zUdemy.section05.page.LoginPage;

public class FirstFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        LoginPage formPage11 = new LoginPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
