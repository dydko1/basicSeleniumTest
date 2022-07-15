package trash.a_NullPointer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase1 {
    // declare WebDriver
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    //@BeforeMethod
    //@BeforeSuite
    //@BeforeClass
    //@BeforeTest
    //public void setUp() {
    // "NullPointerException" issue solved partially
   static {
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
        //options.addArguments("start-maximized");
        //options.addArguments("start-maximized", "window-position=-2000,0"); //, "start-maximized");

        WebDriverManager.chromedriver().setup();
        options.addArguments("window-position=-2000,0", "start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
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