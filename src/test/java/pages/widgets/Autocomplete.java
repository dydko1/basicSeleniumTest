package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.List;

public class Autocomplete extends TestBase {
    By inputSearch = By.id("search");
    By list = By.cssSelector("#ui-id-1 > li > div");

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/autocomplete.php");

        driver.findElement(inputSearch).sendKeys("a");
        Thread.sleep(500);
        List<WebElement> listItems = driver.findElements(list);

        System.out.println(listItems.size());
        for (WebElement web : listItems) {
            System.out.println(web.getText());
        }

        listItems.get(2).click();
        //System.out.println(driver.findElement(By.cssSelector("#ui-id-1")).getText());
        //driver.findElement(By.cssSelector("div:nth-of-type(1)")).click();

        //for ()
        Thread.sleep(2500);
    }
}