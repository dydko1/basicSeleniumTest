package zUdemy.base.test;

import org.testng.annotations.Test;
import zUdemy.base.page.FormPage11;
import zUdemy.base.page.ProgressBarPage11;

public class FirstFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        FormPage11 formPage11 = new FormPage11(driver);
        formPage11.fillForm11();
        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
        progressBarPage11.fillForm();
        Thread.sleep(2500);
    }
}
