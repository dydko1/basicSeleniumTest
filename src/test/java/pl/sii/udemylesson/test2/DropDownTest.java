package pl.sii.udemylesson.test2;

import org.testng.annotations.Test;
import pl.sii.udemylesson.page2.DropDownPage;
import pl.sii.udemylesson.test1.BaseTestA;

public class DropDownTest extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.fillForm();
        System.out.println(dropDownPage.getTitle());
        Thread.sleep(2500);
    }
}