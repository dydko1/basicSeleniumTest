package guru99.accessing.page;

import com.google.common.base.Supplier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zUdemy.base.page.BasePage11;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class JS_Page extends BasePage11 {
    public JS_Page(WebDriver driver) {
        super(driver);
    }

    By uid = By.name("uid");
    By password = By.name("password");
    // By button = By.cssSelector("input[name='btnLogin']");
    By iFrame = By.id("save");

    //By partial = By.partialLinkText("click here");

    public void fillForm11() throws InterruptedException {
        driver.get("http://demo.guru99.com/V4/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));
        driver.switchTo().frame(iFrame2);
        Thread.sleep(500);
        WebElement auth = driver.findElement(By.id("save"));
        driver.findElement(iFrame).click();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.findElement(uid).sendKeys("mngr445545");
        driver.findElement(password).sendKeys("mArUsAg");

        //ok js.executeScript("arguments[0].click();", driver.findElement(button));

        WebElement button1 = driver.findElement(By.cssSelector("input[name='btnLogin']"));
        js.executeScript("var btn=document.createElement('newButton'); document.body.appendChild(btn);");
        //js.executeScript("arguments[0].click();", button1);

        Thread.sleep(2000);

        //js.executeScript("alert('Welcome To Selenium Testing');");
        //js.executeScript("history.go(0)");
        //String domainName=  js.executeScript("return document.domain;").toString();
        //System.out.println(domainName);



        Thread.sleep(1000);


//        WebElement button = driver.findElement(By.cssSelector("input[name='btnLogin']"));
//        //js.executeScript("alert('Welcome to Guru99');");
//        Thread.sleep(500);
//        js.executeAsyncScript("arguments[0].click();", button);
//        Thread.sleep(2000);

        /*
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
*/
//        driver.switchTo().frame(iFrame2);
//        //Thread.sleep(500);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save")));
//        driver.findElement(iFrame).click();
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

//        wait.until(ExpectedConditions.presenceOfElementLocated(partial));
//        driver.findElement(partial).click();

        driver.quit();


//        driver.findElement(drop).sendKeys("miroslaw.dyduch@gmail.com");
//        driver.findElement(password).sendKeys("rahulshettyacademy");
//        driver.findElement(loginButton).click();
    }
}
