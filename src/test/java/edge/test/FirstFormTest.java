package edge.test;

import edge.page.FormPage11;
import edge.page.LoginPage;
import edge.page.ProgressBarPage11;
import org.testng.annotations.Test;

public class FirstFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        LoginPage formPage11 = new LoginPage(driver);
        formPage11.fillForm11();
        Thread.sleep(2500);
    }
}
