package _workingPOM.test;

import _workingPOM.page.FormPage11;
import _workingPOM.page.ProgressBarPage11;
import org.testng.annotations.Test;

public class FirstFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        FormPage11 formPage11 = new FormPage11(driver);
        formPage11.fillForm11();
        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
        progressBarPage11.fillForm();
        Thread.sleep(2500);
    }

    @Test(priority = 2)
    void fillForm2() throws InterruptedException {
        FormPage11 formPage11 = new FormPage11(driver);
        formPage11.fillForm11();
        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
        progressBarPage11.fillForm();
        Thread.sleep(2500);
    }
}
