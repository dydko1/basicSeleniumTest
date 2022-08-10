package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.base.TestBase;

public class Dialog1 extends TestBase {
    By buttonCreteUser = By.id("create-user");
    By buttonCreteAccount = By.cssSelector("div[class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix'] button:nth-child(1)");
    By inputName = By.id("name");
    By inputEmail = By.id("email");
    By inputPassword = By.id("password");
    By lastRow = By.cssSelector("tbody > tr:last-of-type");
    User user;

    @BeforeMethod
    void prepareData() {
        setUserData();
    }

    @Test
    void fillForm() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/modal-dialog.php");

        driver.findElement(buttonCreteUser).click();

        wait.until(ExpectedConditions.elementToBeClickable(inputName));
        driver.findElement(inputName).clear();
        driver.findElement(inputName).sendKeys(user.getName());

        driver.findElement(inputEmail).clear();
        driver.findElement(inputEmail).sendKeys(user.getEmail());

        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys(user.getPassword());

        driver.findElement(buttonCreteAccount).click();

        //driver.findElement(lastRow.).getText();

        Assert.assertTrue(checkAddedData());
        //System.out.println(test1.findElements(By.cssSelector("td")).get(0).getText());
        //System.out.println(test1.findElements(By.cssSelector("td")).get(1).getText());
        //System.out.println(test1.findElements(By.cssSelector("td")).get(2).getText());

        Thread.sleep(2500);
    }

    void setUserData() {
        user = new User();
        user.setName("Miroslaw Dyduch");
        user.setEmail("miro@wp.pl");
        user.setPassword("TajneHaslo");
    }

    Boolean checkAddedData() {
        WebElement test1 = driver.findElement(lastRow);
        //System.out.println(((test1.findElements(By.cssSelector("td")).get(0).getText())));
        return (((test1.findElements(By.cssSelector("td")).get(0).getText()).contains(user.getName())) &&
                (test1.findElements(By.cssSelector("td")).get(1).getText()).contains(user.getEmail()) &&
                (test1.findElements(By.cssSelector("td")).get(2).getText()).contains(user.getPassword()));
    }
}