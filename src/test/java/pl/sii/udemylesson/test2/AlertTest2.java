package pl.sii.udemylesson.test2;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page2.Alert2;
import pl.sii.udemylesson.page2.DropDownPage2;
import pl.sii.udemylesson.test1.BaseTestA;

public class AlertTest2 extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        Alert2 dropDownPage = new Alert2(driver);
        dropDownPage.fillForm();

        Thread.sleep(2500);
    }

    @Test(priority = 0)
    void fillForm2() throws InterruptedException {
        Alert2 dropDownPage2 = new Alert2(driver);
        dropDownPage2.fillForm2();

        Thread.sleep(2500);
    }
}