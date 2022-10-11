package guru99.accessing.test;

import guru99.accessing.page.JS_Page;
import guru99.accessing.page.JS_Page2;
import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;

public class JS_FormTest2 extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        JS_Page2 formPage11 = new JS_Page2(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
