package pl.sii.udemylesson.page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pl.sii.udemylesson.page1.BasePageA;

import java.util.List;

public class DropDownPage extends BasePageA {

    By dropdown = By.cssSelector(getSelector());

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(dropdown).click();
        //driver.findElement(By.xpath("//option[@value='AED']")).click();
        Select select = new Select(driver.findElement(dropdown));
        List<WebElement> options = select
                .getOptions();
        options
                .stream()
                .forEach(s -> System.out.println(s.getText()));
        System.out.println();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    private String getSelector() {
        return "#ctl00_mainContent_DropDownListCurrency";
    }
}