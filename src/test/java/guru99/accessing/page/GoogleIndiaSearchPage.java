package guru99.accessing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zUdemy.base.page.BasePage11;

import java.time.Duration;

public class GoogleIndiaSearchPage extends BasePage11 {
    public GoogleIndiaSearchPage(WebDriver driver) {
        super(driver);
    }

    By textBox = By.name("q");
    By acceptButton = By.cssSelector("span div:nth-child(3) button:nth-child(2)");
    By listBox = By.cssSelector("ul[role='listbox'] ul[role='listbox']");
    //By partial = By.partialLinkText("click here");

    public void fillForm11() throws InterruptedException {

        driver.get("https://www.google.com/");

//        WebElement email = driver.findElement(By.id("email"));

        //Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(acceptButton));
        driver.findElement(acceptButton).click();
//        WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));

        WebElement searchText = driver.findElement(textBox);

        searchText.sendKeys("india");
        searchText.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(listBox));
        WebElement listBox1 = driver.findElement(listBox);

        System.out.println(listBox1.getText());
        Thread.sleep(2000);

//        driver.switchTo().frame(iFrame2);
//        //Thread.sleep(500);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save")));
//        driver.findElement(iFrame).click();
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

//        wait.until(ExpectedConditions.presenceOfElementLocated(partial));
//        driver.findElement(partial).click();
        Thread.sleep(2000);
        driver.quit();


//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
