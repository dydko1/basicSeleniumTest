package zUdemy.section05.test;

import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;
import zUdemy.section05.page.WatirPage;

public class WatirTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        WatirPage formPage11 = new WatirPage(driver);
        //formPage11.getNestedElement();
        formPage11.getNestedElementJS();

        Thread.sleep(2500);
    }
}