package pl.sii.udemylesson.test1;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page1.FormPageA;
import pl.sii.udemylesson.page1.ProgressBarPage11;

public class FirstFormTest extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        FormPageA formPage1133 = new FormPageA(driver);
        formPage1133.fillForm11();
        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
        progressBarPage11.fillForm();
        Thread.sleep(2500);
    }

//    @Test(priority = 2)
//    void fillForm2() throws InterruptedException {
//        FormPageA formPage1133 = new FormPageA(driver);
//        formPage1133.fillForm11();
//        ProgressBarPage11 progressBarPage11 = new ProgressBarPage11(driver);
//        progressBarPage11.fillForm();
//        Thread.sleep(2500);
//    }
}