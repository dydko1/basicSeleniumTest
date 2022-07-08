package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class AlertDrag extends TestBase {
    By dragSquare = By.id("draggable");
    By dropDest = By.id("droppable");

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/draggable.php");

        WebElement from = driver.findElement(dragSquare);

        Actions act = new Actions(driver);

        Thread.sleep(500);
        //Dragged and dropped.
        act.dragAndDropBy(from, 200, 200).perform();

        Thread.sleep(2500);
    }

    @Test
    public void dropElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/droppable.php");

        Thread.sleep(500);
        WebElement from = driver.findElement(dragSquare);
        WebElement dest1 = driver.findElement(dropDest);

        Actions act = new Actions(driver);
        Thread.sleep(500);
        act.dragAndDrop(from,dest1).build().perform();
        //act.dragAndDropBy(from, 150,20).build().perform();

        System.out.println(dest1.findElement(By.cssSelector("p")).getText());
        Thread.sleep(2500);

    }
}