package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.base.TestBase;

public class ProgressBar1 extends TestBase {
    //By progressBar = By.className(".progress-label");
    By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

    @Test
    void fillForm() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        wait.until(ExpectedConditions.elementToBeClickable(progressBar));
        String text = driver.findElement(progressBar).getText();
        Assert.assertEquals(text, "Complete!");

//        driver.findElement(progressBar).getText();

        Thread.sleep(2500);
    }
}