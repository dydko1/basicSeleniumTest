package zUdemy.section08.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import zUdemy.base.page.BasePage11;

import java.util.ArrayList;
import java.util.List;

public class ShopPage extends BasePage11 {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    By dropDownSelector = By.id("ctl00_mainContent_DropDownListCurrency");
    By allProducts = By.cssSelector("h4.product-name");
    By clickOnFly = By.cssSelector("a[title='Web Check-in'] span[class='text-label text-active']");

    public void fillForm11() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        Thread.sleep(1000);
        List<WebElement> webElementLists = driver.findElements(allProducts);

        for (WebElement ele : webElementLists) {
            System.out.println(ele.getLocation());
        }

//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
