package pl.sii.udemylesson.test2;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page2.RealTime2;
import pl.sii.udemylesson.test1.BaseTestA;

public class RealTimeTest2 extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        RealTime2 dropDownPage = new RealTime2(driver);
        dropDownPage.fillForm();

        Thread.sleep(2500);
    }
}