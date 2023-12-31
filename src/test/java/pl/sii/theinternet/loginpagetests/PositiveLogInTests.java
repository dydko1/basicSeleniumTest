package pl.sii.theinternet.loginpagetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.sii.theinternet.base.TestUtilities;

import java.time.Duration;

public class PositiveLogInTests extends TestUtilities {

    @Test
    public void logInTest() {
        System.out.println("Starting logIn test");

        // open main page
        String url = "https://the-internet.herokuapp.com";
        driver.get(url);
        System.out.println("Main page is opened.");

        // Click on Form Authentication link
        driver.findElement(By.linkText("Form Authentication")).click();

        // enter username and password
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        sleep(3000);

        // push log in button
        WebElement logInButton = driver.findElement(By.className("radius"));
        wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();

        // verifications
        // new url
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        // log out button is visible
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='button secondary radius']")).isDisplayed(),
                "logOutButton is not visible.");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
    }
}