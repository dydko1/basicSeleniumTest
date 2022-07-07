package pages.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    // declare WebDriver
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        /*
        // set directory to your chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        
        // create chrome options and add argument to run it maximized
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        
        // initialize chromedriver with previously specified options and open browser
        driver = new ChromeDriver(options);
        */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        //wait.withTimeout(5000, TimeUnit.MILLISECONDS);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //wait = waitForSec(10);


//        EdgeOptions optEdgeDriver = new EdgeOptions();
//        optEdgeDriver.addArguments("start-maximized");
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver(optEdgeDriver);

    }

    @AfterMethod
    public void tearDown() {
        // close chromedriver and browser
        driver.quit();
    }

    /*
    protected WebDriverWait waitForSec(int timeSec) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeSec));
    }
     */
}