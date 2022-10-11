package guru99.accessing.test;

import guru99.accessing.page.AccessingPage;
import guru99.accessing.page.GoogleIndiaSearchPage;
import org.testng.annotations.Test;
import zUdemy.base.test.BaseTest;

public class GoogleIndiaFormTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        GoogleIndiaSearchPage formPage11 = new GoogleIndiaSearchPage(driver);
        formPage11.fillForm11();

        Thread.sleep(2500);
    }
}
