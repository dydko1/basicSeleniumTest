package zUdemy.section07.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import zUdemy.base.page.BasePage11;

public class DropPage extends BasePage11 {
    public DropPage(WebDriver driver) {
        super(driver);
    }

    By dropDownSelector = By.id("ctl00_mainContent_DropDownListCurrency");
    By password = By.cssSelector("input[placeholder='Password']");
    By loginButton = By.cssSelector("button[type='submit']");
    By clickOnFly=By.cssSelector("a[title='Web Check-in'] span[class='text-label text-active']");

    public void fillForm11() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement dropDown = driver.findElement(dropDownSelector);
        Select dropDownElements = new Select(dropDown);
        dropDownElements.selectByIndex(0);
        Thread.sleep(1000);
        clickOnElement(clickOnFly);
        Thread.sleep(1000);
//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
