package zUdemy.section08.test;

import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;
import zUdemy.section08.page.AlertPage;
import zUdemy.section08.page.ShopPage;

public class AlertFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        AlertPage formPage11 = new AlertPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
