package pages.a_NullPointer;

import org.testng.annotations.Test;
import pages.base.TestBase;

public class TestTC{

    @Test
    void Test111() throws InterruptedException {

        ProgressBar22 pro = new ProgressBar22();
        pro.fillForm();
        Thread.sleep(500);
    }
}