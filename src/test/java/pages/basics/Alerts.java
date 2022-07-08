package pages.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

public class Alerts extends TestBase {
    By buttonSimpleAlert = By.id("simple-alert");
    By buttonPromptAlert = By.id("prompt-alert");
    By buttonConfirmAlert = By.id("confirm-alert");
    By buttonDelayedAlert = By.id("delayed-alert");

    By confirmText = By.id("confirm-label");

    @Test
    public void clickSimpleAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        driver.findElement(buttonSimpleAlert).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
    }

    @Test
    public void clickPromptAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        driver.findElement(buttonPromptAlert).click();

        /*
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Witaj Miroslaw");
        Thread.sleep(1000);
        promptAlert.accept();
        */

        driver.switchTo().alert().sendKeys("Hello Lord Vader! How are you today?");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Test
    public void clickConfirmAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        driver.findElement(buttonConfirmAlert).click();
        driver.switchTo().alert().accept();
        assert (driver.findElement(confirmText).getText().contentEquals("You pressed OK!"));
        driver.findElement(buttonConfirmAlert).click();
        driver.switchTo().alert().dismiss();
        assert (driver.findElement(confirmText).getText().contentEquals("You pressed Cancel!"));
        Thread.sleep(2000);
    }

    @Test
    public void clickDelayAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        driver.findElement(buttonDelayedAlert).click();
        //Thread.sleep(5000);
        //wait = waitForSec(10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

    }
}