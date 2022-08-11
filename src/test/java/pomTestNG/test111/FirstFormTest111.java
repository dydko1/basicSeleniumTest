package pomTestNG.test111;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pomTestNG.pages111.FormPage111;
import pomTestNG.pages111.ProgressBarPage111;
import pomTestNG.test111.base.BaseTest111;

public class FirstFormTest111 extends BaseTest111 {

    @Ignore
    @Test
    void fillForm1() throws InterruptedException {
        FormPage111 formPage11 = new FormPage111(driver);
        formPage11.fillForm11();
//        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
//        progressBarPage11.fillForm();
        Thread.sleep(3500);
    }

    @Ignore
    @Test(priority = 2)
    void fillForm2() throws InterruptedException {
        FormPage111 formPage11 = new FormPage111(driver);
        formPage11.fillForm11();
        ProgressBarPage111 progressBarPage11 = new ProgressBarPage111(driver);
        progressBarPage11.fillForm();
        Thread.sleep(2500);
    }
}
