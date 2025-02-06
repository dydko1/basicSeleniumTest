package pl.sii.udemylesson.pagination;

import org.testng.annotations.Test;

import pl.sii.udemylesson.test1.BaseTestA;

public class Pagination1 extends BaseTestA {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        Pagination dropDownPage = new Pagination(driver);
        dropDownPage.fillForm();

        Thread.sleep(2500);
    }

}