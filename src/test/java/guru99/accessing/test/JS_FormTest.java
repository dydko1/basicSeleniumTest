package guru99.accessing.test;

import guru99.accessing.page.GoogleIndiaSearchPage;
import guru99.accessing.page.JS_Page;
import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;

public class JS_FormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        JS_Page formPage11 = new JS_Page(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
