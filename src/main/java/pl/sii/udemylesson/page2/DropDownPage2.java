package pl.sii.udemylesson.page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pl.sii.udemylesson.page1.BasePageA;

import java.util.List;

public class DropDownPage2 extends BasePageA {

    By dropdown = By.cssSelector("#divpaxinfo");
    By plusButton = By.cssSelector("#hrefIncAdt");
    // -------------
    By countryDropDown = By.cssSelector("input[placeholder='Type to Select']");
    By countryList = By.cssSelector("ul.ui-autocomplete li");

    public DropDownPage2(WebDriver driver) {
        super(driver);
    }

    public void fillForm() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(dropdown).click();
        Thread.sleep(1000);
        driver.findElement(plusButton).click();

    }

    public void fillForm2() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.findElement(countryDropDown).click();
        //Thread.sleep(1000);
        driver.findElement(countryDropDown).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> webElementList=driver.findElements(countryList);

        for (WebElement webElement : webElementList) {
            if(webElement.getText().equalsIgnoreCase("InDiA")){
                webElement.click();
                System.out.println("papapapapapa");
                break;
            }
        }
    }
}