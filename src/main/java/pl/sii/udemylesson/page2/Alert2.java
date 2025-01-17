package pl.sii.udemylesson.page2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.sii.udemylesson.page1.BasePageA;

import java.time.Duration;
import java.util.List;

public class Alert2 extends BasePageA {

    By switchAlert = By.cssSelector("#name");
    By alertBtn = By.cssSelector("#alertbtn");

    public Alert2(WebDriver driver) {
        super(driver);
    }

    public void fillForm() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(switchAlert).sendKeys("Miro");
        driver.findElement(alertBtn).click();
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();
        System.out.println("---------------------");
        //driver.switchTo().alert();
        System.out.println("abc: " + waitForElement.until(ExpectedConditions.alertIsPresent()));
        checkAlert(); //ok
        System.out.println("---------------------");
        //driver.switchTo().alert().accept();


        Thread.sleep(1000);
    }


    public void fillForm2() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(switchAlert).sendKeys("Miro");
        //driver.findElement(alertBtn).click();
        //System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();
        if (isAlertPresent(driver)) {
            System.out.println("Miro1: Alert present");
        } else {
            System.out.println("Miro2: No alert present");
        }


        Thread.sleep(1000);
    }

    private static boolean isAlertPresent(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0L));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (TimeoutException eTO) {
            return false;
        }
    }

    private boolean checkAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText() + " Alert is Displayed");
            return true;
        } catch (NoAlertPresentException ex) {
            System.out.println("Alert is NOT Displayed");
            return false;
        }
    }
}