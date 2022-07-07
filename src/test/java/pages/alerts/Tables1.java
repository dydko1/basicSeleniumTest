package pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Tables1 extends TestBase {
    By tableTbody = By.cssSelector("table > tbody");

    @Test
    public void clickSimpleAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/table.php");
        String current_Window = driver.getWindowHandle();

        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        while (i.hasNext()) {
            String child_window = i.next();
            if (!child_window.equalsIgnoreCase(current_Window)) {
                driver.switchTo().window(child_window);
            }
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(tableTbody));

        for (WebElement tr1 : driver.findElement(tableTbody).findElements(By.cssSelector("tr"))) {
            int height = Integer.valueOf(tr1.findElements(By.cssSelector("td:nth-of-type(4)")).get(0).getText());
            if ((tr1 != null) && (tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText().contains("Switzerland")) && (height > 4000))
                System.out.println(
                        tr1.findElements(By.cssSelector("td:nth-of-type(1)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(2)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText());
        }
        //Thread.sleep(1500);
    }
}