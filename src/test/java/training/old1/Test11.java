package training.old1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;

public class Test11 {
    static WebDriver driver;
    //static WebDriverWait wait1;

    @BeforeMethod
    protected void setup() {
        System.out.println("Before method 1");
        Reporter.log("=====Browser Session Started=====", true);

        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://seleniumui.moderntester.pl/progressbar.php");
        //wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        Reporter.log("=====Application Started=====", true);
    }

    @AfterMethod
    protected void byby() {
        System.out.println("After method 1");
        driver.quit();
    }
}
