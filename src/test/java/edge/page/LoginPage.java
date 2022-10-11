package edge.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import zUdemy.base.page.BasePage11;

public class LoginPage extends BasePage11 {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By email = By.id("inputUsername");
    By password = By.cssSelector("input[placeholder='Password']");
    By loginButton=By.cssSelector("button[type='submit']");


    public void fillForm11() {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(email).sendKeys("miroslaw.dyduch@gmail.com");
        driver.findElement(password).sendKeys("rahulshettyacademy");
        driver.findElement(loginButton).click();

    }
}
