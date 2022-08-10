package pomTestNG.pages111;

import _workingPOM.page.BasePage11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class ProgressBarPage111 extends BasePage11 {
    //By progressBar = By.className(".progress-label");
    By progressBar = By.xpath("//div[@class='progress-label'][contains(text(),'Complete!')]");

    public ProgressBarPage111(WebDriver driver) {
        super(driver);
    }

    public void fillForm() {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        waitForElement.until(ExpectedConditions.elementToBeClickable(progressBar));
        String text = driver.findElement(progressBar).getText();
        Assert.assertEquals(text, "Complete!");
    }
}