package trash.a_betterScripts2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass12222 {

    public WebDriver driver;
    public WebDriverWait wait1;

    @BeforeTest
    public void setupApplication() {

        Reporter.log("=====Browser Session Started=====", true);

        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://seleniumui.moderntester.pl/progressbar.php");
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        Reporter.log("=====Application Started=====", true);
    }

    @AfterMethod
    public void closeApplication() {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }


}