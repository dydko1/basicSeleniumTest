package guru99.accessing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zUdemy.base.page.BasePage11;

import java.time.Duration;

public class PartialPage extends BasePage11 {
    public PartialPage(WebDriver driver) {
        super(driver);
    }

    By iFrame = By.id("save");
    By partial = By.partialLinkText("click here");

    public void fillForm11() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/accessing-link.html");

//        WebElement email = driver.findElement(By.id("email"));

        //Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='gdpr-consent-notice']")));
        WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));
        driver.switchTo().frame(iFrame2);
        //Thread.sleep(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save")));
        driver.findElement(iFrame).click();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.presenceOfElementLocated(partial));
        driver.findElement(partial).click();
        Thread.sleep(2000);
        driver.quit();


//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
