package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.List;

public class PickerClicking extends TestBase {
    By inputDatePicker = By.id("datepicker");
    By previous = By.cssSelector("a[title='Prev']");
    By yearCss = By.cssSelector(".ui-datepicker-year");
    By monthCss = By.cssSelector(".ui-datepicker-month");
    By selectDay = By.cssSelector("tbody tr:nth-child(3) td:nth-child(4) a:nth-child(1)");

    @Test
    public void dragElement() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/datepicker.php");

        driver.findElement(inputDatePicker).click();

        selectDateInCalendar("July", "2018");

        driver.findElement(selectDay).click();

        //Thread.sleep(500);

        //for ()
        Thread.sleep(5000);
    }

    void selectDateInCalendar(String months, String years) {
        String year;
        String month;
        Boolean isProperDate;

        do {
            // Workaround
            WebElement tracker = driver.findElement(inputDatePicker);
            new Actions(driver).moveToElement(tracker, 0, 0).perform();
            wait.until(ExpectedConditions.presenceOfElementLocated(previous));
            driver.findElement(previous).click();

            year = driver.findElement(yearCss).getText();
            month = driver.findElement(monthCss).getText();

            isProperDate = !(years.contains(year) && months.contains(month));
        } while (isProperDate);
    }
}