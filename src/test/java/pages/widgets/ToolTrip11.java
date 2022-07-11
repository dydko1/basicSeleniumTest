package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.List;

public class ToolTrip11 extends TestBase {
    By toolTrip1 = By.cssSelector("main[class='container'] > div > p > a");
    By inputField = By.id("age");

    @Test
    void selectRandomRow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/tooltip.php");
        List<WebElement> links = driver.findElements(toolTrip1);
        System.out.println(links.size());

        WebElement link = links.get(0);
//        Actions action = new Actions(driver)
//                .clickAndHold(clickable);
//
//        action.perform();

        System.out.println("ToolTrip1=" + link.getAttribute("title"));
        link = links.get(1);
        System.out.println("ToolTrip2=" + link.getAttribute("title"));

        System.out.println("ToolTrip3" + driver.findElement(inputField).getAttribute("title"));

        Thread.sleep(1000);
    }

}