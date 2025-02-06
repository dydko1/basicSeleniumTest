package pl.sii.udemylesson.pagination;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.sii.udemylesson.page1.BasePageA;

import java.time.Duration;
import java.util.Objects;

public class Pagination extends BasePageA {

    By previousPage = By.cssSelector("button[aria-label='Previous']");
    By nextPage = By.cssSelector("button[aria-label='Next']");

    public Pagination(WebDriver driver) {
        super(driver);
    }

    public void fillForm() throws InterruptedException {
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");

        clickNextPage();
//        driver.findElement(nextPage)
//                .click();
//
//        driver.findElement(nextPage).getAttribute("class").contains("next");

        Thread.sleep(1000);
    }

    private void clickNextPage() throws InterruptedException {
        while (isNextPage()) {
            Thread.sleep(1000);
            driver.findElement(nextPage)
                    .click();
        }

    }

    Boolean isNextPage() {
        return !driver.findElement(nextPage)
                .getAttribute("class")
                .contains("disabled");
    }
}