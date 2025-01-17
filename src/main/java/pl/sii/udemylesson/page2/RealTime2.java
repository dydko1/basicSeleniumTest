package pl.sii.udemylesson.page2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.sii.udemylesson.page1.BasePageA;

import java.util.ArrayList;
import java.util.List;

public class RealTime2 extends BasePageA {

    By switchAlert = By.cssSelector("#name");
    By alertBtn = By.cssSelector("#alertbtn");

    By bucket = By.cssSelector(".product-name");

    public RealTime2(WebDriver driver) {
        super(driver);
    }

    public void fillForm() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/seleniumPractise");

        List<WebElement> list = driver.findElements(bucket);

        list.forEach(s -> System.out.println(s.getText()));

        Thread.sleep(1000);
    }


}