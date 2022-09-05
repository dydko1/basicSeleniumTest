package test2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Listeners({Listener.class})
class ReporterTest {

    public String username = "miroslaw.dyduch";
    public String accesskey = "9dJmJ94ddM0ABajY9Fjul5vHEKlwTCzBDDmF6QU83JMBMVcgMV";
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";

    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("version", "93.0");
//        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
//        capabilities.setCapability("build", "TestNGReporterLog");
//        capabilities.setCapability("name", "TestNGReporterLogSample");

        ChromeOptions options = new ChromeOptions();

        WebDriverManager.chromedriver().setup();
        //options.addArguments("window-position=-2000,0", "start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.navigate().to(appURL);
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void learnSingleInputFieldUsingSelenium() {
        try {
            Reporter.log("Logging into Selenium Playground");
            driver.get("https://www.lambdatest.com/selenium-playground/");
            Reporter.log("Logged into Selenium Playground. Now, Clicking On Simple Form Demo", true);

            //Clicks on the simple form demo option in the selenium playground
            WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
            simpleFormDemo.click();
            Reporter.log("Clicked successfully on Simple Form Demo option.", 2);

            //Enters the message in the enter message input box
            WebElement messageInputBox = driver.findElement(By.xpath("//input[@id='user-message']"));
            messageInputBox.sendKeys("Running my first testcase using Lambda Test");

            //Clicks on Show Message button
            WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
            showMessageButton.click();

            //Retrieves the entered user message
            WebElement userMessage = driver.findElement(By.xpath("//label[text()='Your Message: ']//parent::div//span"));
            String actualUserText = userMessage.getText();
            Reporter.log("Actual User Input Is: " + actualUserText, 2, true);

            Assert.assertTrue(actualUserText.equals("Running my first testcase using Lambda Test"), "Expected and actual texts do not match.");
        } catch (Exception e) {

        }

    }

    @Test
    public void learnMultipleInputFieldUsingSelenium() {
        try {
            Reporter.log("Logging into Selenium Playground");
            driver.get("https://www.lambdatest.com/selenium-playground/");
            Reporter.log("Logged into Selenium Playground. Now, Clicking On Simple Form Demo", true);

            WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
            simpleFormDemo.click();
            Reporter.log("Clicked successfully on Simple Form Demo option For Multiple input fields.", 2);

            WebElement firstInputBox = driver.findElement(By.xpath("//input[@id='sum1']"));
            firstInputBox.sendKeys("2");

            WebElement secondInputBox = driver.findElement(By.xpath("//input[@id='sum2']"));
            secondInputBox.sendKeys("2");

            WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
            getTotalButton.click();

            WebElement userMessage = driver.findElement(By.xpath("//label[text()='Total a + b = ']//parent::div//span"));
            String actualUserText = userMessage.getText();

            Reporter.log("The total of the two entered user inputs is: " + actualUserText, 2, true);
            Assert.assertTrue(actualUserText.equals("4"), "Expected and actual texts do not match.");
        } catch (Exception e) {

        }

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        Reporter.log("The driver has been closed.", false);

    }

}