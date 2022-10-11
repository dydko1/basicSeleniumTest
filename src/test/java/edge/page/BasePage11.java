package edge.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage11 {
    public WebDriver driver;
    protected WebDriverWait waitForElement;

    //Constructor
    public BasePage11(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Start BasePage11");
    }
}
