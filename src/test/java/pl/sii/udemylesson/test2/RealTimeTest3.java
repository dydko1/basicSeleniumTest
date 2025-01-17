package pl.sii.udemylesson.test2;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page2.RealTime2;
import pl.sii.udemylesson.page2.RealTime3;
import pl.sii.udemylesson.test1.BaseTestA;

public class RealTimeTest3 extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        RealTime3 dropDownPage = new RealTime3(driver);
        dropDownPage.fillForm();

        Thread.sleep(2500);
    }
}