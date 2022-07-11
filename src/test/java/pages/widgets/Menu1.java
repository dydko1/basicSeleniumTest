package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

public class Menu1 extends TestBase {
    By menuLevelMusic = By.xpath("//ul/li/div[contains(text(),'Music')]");
    //By menuLevelMusic = By.cssSelector("div:contains('Music')");
    By jazzLevel = By.xpath("//ul/li/div[contains(text(),'Jazz')]");
    By modernLevel = By.xpath("//ul/li/div[contains(text(),'Modern')]");


    @Test
    public void dragElement() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/menu-item.php");

        wait.until(ExpectedConditions.elementToBeClickable(menuLevelMusic));
        WebElement tracker = driver.findElement(menuLevelMusic);
        tracker.click();

        //new Actions(driver).moveToElement(tracker).perform();
        wait.until(ExpectedConditions.elementToBeClickable(jazzLevel));
        tracker = driver.findElement(jazzLevel);
        tracker.click();

        wait.until(ExpectedConditions.elementToBeClickable(modernLevel));
        tracker = driver.findElement(modernLevel);
        tracker.click();


        Thread.sleep(2500);
    }

}