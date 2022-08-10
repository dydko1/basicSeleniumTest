package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccordionPractise extends TestBase {
    By accordion = By.id("accordion");

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/accordion.php");

        String text;
        for (int i = 1; i <= 4; i++) {
            driver.findElement(By.cssSelector("h3:nth-of-type(" + i + ")")).click();
            text = driver.findElement(By.cssSelector("#accordion > div:nth-of-type(" + i + ")")).getText();
            // Feature for tag "p" should be added
            System.out.println(text+"\n");
            Thread.sleep(500);
        }
        System.out.println(accordion.toString());


    }
}