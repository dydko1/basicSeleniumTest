package pl.sii.udemylesson.test2;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page2.NewWindow1;
import pl.sii.udemylesson.test1.BaseTestA;


public class NewWindow extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        NewWindow1 dropDownPage = new NewWindow1(driver);
        dropDownPage.fillForm();

        Thread.sleep(2500);
    }
}