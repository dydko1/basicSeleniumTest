package zUdemy.base.page;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StaleElement extends BasePage11 {
    public StaleElement(WebDriver driver) {
        super(driver);
    }

    public void stalePage1() {
        driver.get("https://www.lambdatest.com/selenium-playground/");

//        WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='task-table-filter']")));

//        WebElement closePopUp = driver.findElement(By.xpath("//span[@id='exit_popup_close']"));
//        closePopUp.click();
//        System.out.println("--------------");


        WebElement pageLink = driver.findElement(By.linkText("Table Data Search"));
        pageLink.click();
        WebElement filterByField = driver.findElement(By.xpath("//input[@id='task-table-filter']"));
        filterByField.sendKeys("in progress");
        driver.navigate().back();
        pageLink.click();
        filterByField = driver.findElement(By.xpath("//input[@id='task-table-filter']"));
        filterByField.sendKeys("completed");

        System.out.println("dddd");
    }

    public void stalePage2() {
        driver.get("https://www.lambdatest.com/selenium-playground/");
        By filterField = By.xpath("//input[@id='task-table-filter']");
        WebElement pageLink = driver.findElement(By.linkText("Table Data Search"));
        pageLink.click();
        retryUsingWhileLoopTryCatch(filterField, "in progress");
        driver.navigate().back();
        pageLink.click();
        retryUsingWhileLoopTryCatch(filterField, "complete");

        System.out.println("dddd");
    }


    public void stalePage3() {
        driver.get("https://www.lambdatest.com/selenium-playground/");
        By filterField = By.xpath("//input[@id='task-table-filter']");
        WebElement pageLink = driver.findElement(By.linkText("Table Data Search"));
        pageLink.click();
        chainMultiple(filterField, "in progress");
        driver.navigate().back();
        pageLink.click();
        chainMultiple(filterField, "complete");

        System.out.println("dddd");
    }

    private boolean retryUsingWhileLoopTryCatch(By locator, String value) {

        boolean outcome = false;
        int repeat = 0;
        while (repeat <= 3) {
            System.out.println("---------------------------------");
            try {
                System.out.println("################################");
                driver.findElement(locator).sendKeys(value);
                outcome = true;
                break;
            } catch (StaleElementReferenceException exc) {
                System.out.println("++++++++++++++++++++++++++++");
                exc.printStackTrace();
            }
            repeat++;
        }
        return outcome;
    }

    private void chainMultiple(By locator, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(locator)));
        driver.findElement(locator).sendKeys(value);
        return;
    }
}
