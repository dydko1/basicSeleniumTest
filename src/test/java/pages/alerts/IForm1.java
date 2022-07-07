package pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.lang.annotation.Repeatable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IForm1 extends TestBase {
    // iframe 1
    By iframe1 = By.name("iframe1");
    By inputFirstName = By.id("inputFirstName3");
    By inputLastName = By.id("inputSurname3");
    By buttonSignIn = By.cssSelector("button[type='submit']");
    // iframe 2
    By iframe2 = By.name("iframe2");
    By inputLogin = By.id("inputLogin");
    By inputPassword = By.id("inputPassword");
    By selectContinent = By.id("inlineFormCustomSelectPref");
    By radioYourExperience = By.cssSelector("fieldset > div > div > div > input");

    WebElement iframe;

    @Test
    public void clickSimpleAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/iframes.php");
        iframe = driver.findElement(iframe1);
        driver.switchTo().frame(iframe);

        driver.findElement(inputFirstName).sendKeys("Miroslaw");
        driver.findElement(inputLastName).sendKeys("Dyduch");
        //Thread.sleep(500);
        driver.findElement(buttonSignIn).click();
        driver.switchTo().parentFrame();
        //
        iframe = driver.findElement(iframe2);
        driver.switchTo().frame(iframe);
        driver.findElement(inputLogin).sendKeys("Dydko");
        driver.findElement(inputPassword).sendKeys("secretPassword");

        Random rnd = new Random();
        //List<WebElement> continents = driver.findElements(selectContinent);
        //System.out.println(continents.get(1));
//!!!!        wait.until(ExpectedConditions.presenceOfElementLocated(selectContinent));
        Select continents = new Select(driver.findElement(selectContinent));
        int countContinents = continents.getOptions().size();
        continents.selectByIndex(rnd.nextInt(countContinents) + 1);

        List<WebElement> radio = driver.findElements(radioYourExperience);
        radio.get(rnd.nextInt(radio.size() )).click();

        //
        WebElement element = driver.findElement(buttonSignIn);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(1500);

        //
        driver.findElement(buttonSignIn).click();
        driver.switchTo().parentFrame();

        /*
        Random rnd1 = new Random();
        List<WebElement> radios = driver.findElements(By.id("radio"));
        radios.get(rnd1.nextInt(radios.size())).click();
*/
        Thread.sleep(1500);
    }
}