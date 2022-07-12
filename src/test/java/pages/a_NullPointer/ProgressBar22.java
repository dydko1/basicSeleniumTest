package pages.a_NullPointer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBar22 extends TestBase1 {
    //By progressBar = By.className(".progress-label");
    By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

    @Test
    public void fillForm() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        wait.until(ExpectedConditions.elementToBeClickable(progressBar));
        String text = driver.findElement(progressBar).getText();
        Assert.assertEquals(text, "Complete!");

//        driver.findElement(progressBar).getText();

        Thread.sleep(500);
    }
}