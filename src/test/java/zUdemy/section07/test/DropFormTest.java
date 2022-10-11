package zUdemy.section07.test;

import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;
import zUdemy.section07.page.DropPage;

public class DropFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        DropPage formPage11 = new DropPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
