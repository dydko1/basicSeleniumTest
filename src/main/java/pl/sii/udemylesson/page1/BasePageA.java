package pl.sii.udemylesson.page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageA {
    public WebDriver driver;
    protected WebDriverWait waitForElement;

    //Constructor
    public BasePageA(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Start BasePage11");
    }
}