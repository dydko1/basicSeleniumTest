package zUdemy.section08.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import zUdemy.base.page.BasePage11;

import java.util.List;

public class AlertPage extends BasePage11 {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    By buttonAlert = By.cssSelector("input[value='Go!']");

    public void fillForm11() throws InterruptedException {
        String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        clickOnElement(buttonAlert);
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);
        driver.quit();



//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
