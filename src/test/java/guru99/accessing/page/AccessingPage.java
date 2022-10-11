package guru99.accessing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import zUdemy.base.page.BasePage11;

import java.util.Set;

public class AccessingPage extends BasePage11 {
    public AccessingPage(WebDriver driver) {
        super(driver);
    }

    By iFrame = By.id("save");

    public void fillForm11() throws InterruptedException {

        String alertMessage = "";
        driver.get("http://demo.guru99.com/test/login.html");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));
        WebElement login = driver.findElement(By.id("SubmitLogin"));


        Thread.sleep(1000);
        WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));

        driver.switchTo().frame(iFrame2);

        Thread.sleep(500);
        WebElement auth = driver.findElement(By.id("save"));
        driver.findElement(iFrame).click();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Thread.sleep(500);

        email.sendKeys("miroslaw.dyduch@gmail.com");
        password.sendKeys("secretPassword");

        Thread.sleep(500);

        email.clear();
        email.sendKeys("miroslaw.dyduch@gmail.com1111");
        Thread.sleep(500);
        login.click();
        Thread.sleep(1000);
        driver.quit();


//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
