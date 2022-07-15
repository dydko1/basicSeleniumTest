package _workingPOM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class ProgressBarPage11 extends BasePage11 {
    //By progressBar = By.className(".progress-label");
    By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

    public ProgressBarPage11(WebDriver driver) {
        super(driver);
    }

    public void fillForm() {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        waitForElement.until(ExpectedConditions.elementToBeClickable(progressBar));
        String text = driver.findElement(progressBar).getText();
        Assert.assertEquals(text, "Complete!");
    }
}