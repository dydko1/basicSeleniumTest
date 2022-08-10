package pages.select;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Select1 extends TestBase {
    By selectable1 = By.cssSelector("#selectable > li");
    By result = By.id("select-result");

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/selectable.php");


        List<WebElement> webElementLists = driver.findElements(selectable1);
        System.out.println(webElementLists.size());

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).build().perform();

        List<Integer> lists = Arrays.asList(0, 2, 3);
        for (int i = 0; i < webElementLists.size(); i++) {
            if (lists.contains(i))
                webElementLists.get(i).click();

        }

        String text = driver.findElement(result).getText();
        Assert.assertEquals(text, "#1 #3 #4");

        action.keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(1500);
    }
}