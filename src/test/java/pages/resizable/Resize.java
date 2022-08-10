package pages.resizable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

public class Resize extends TestBase {
    By smallWindow = By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se");
    By horizontal=By.cssSelector(".ui-resizable-handle.ui-resizable-e");
    By verticalLine=By.cssSelector(".ui-resizable-handle.ui-resizable-s");;

    @Test
    public void resizeElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/resizable.php");

        Thread.sleep(1000);
        //WebElement from = driver.findElement(smallWindow);
        Actions action = new Actions(driver);


        WebElement target = wait.until(ExpectedConditions.presenceOfElementLocated(horizontal));
        action.clickAndHold(target).moveByOffset(100, 0).release().build().perform();
        Thread.sleep(1500);


        target = wait.until(ExpectedConditions.presenceOfElementLocated(verticalLine));
        action.clickAndHold(target).moveByOffset(0, 100).release().build().perform();
        Thread.sleep(1500);

        target = wait.until(ExpectedConditions.presenceOfElementLocated(smallWindow));
        action.clickAndHold(target).moveByOffset(100, 100).release().build().perform();
        //new Actions(driver).dragAndDropBy(target, 50, 50).build().perform();

        Thread.sleep(1500);
    }
}