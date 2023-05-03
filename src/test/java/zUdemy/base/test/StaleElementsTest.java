package zUdemy.base.test;

import org.testng.annotations.Test;
import zUdemy.base.page.StaleElement;

public class StaleElementsTest extends BaseTest {

    @Test()
    void fillForm1() {
        StaleElement staleElementsTest = new StaleElement(driver);
        staleElementsTest.stalePage1();
    }

    @Test()
    void fillForm2() {
        StaleElement staleElementsTest = new StaleElement(driver);
        staleElementsTest.stalePage2();
    }

    @Test()
    void fillForm3() {
        StaleElement staleElementsTest = new StaleElement(driver);
        staleElementsTest.stalePage3();
    }
}
