package pack2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class TestDemoClass {
    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest extentTest;
    TakesScreenshot takesScreenshot;


    @BeforeClass
    public void beforeClass() {
        htmlReporter = new ExtentSparkReporter("./reports/extentMiro.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Test Mira");
        htmlReporter.config().setReportName("Automation test results");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.setSystemInfo("Organization", "Let's code it ;)");
        extent.setSystemInfo("Browser", "Chrome abc");
        extent.attachReporter(htmlReporter);
    }

    @Test
    public void testName() {
        extentTest = extent.createTest("Successful test");
        extentTest.log(Status.PASS, "Test method successful");
    }

    @Test
    public void testFailed() {
        extentTest = extent.createTest("Failed test");
        extentTest.log(Status.FAIL, "Test method failed");
    }

    @Test
    public void testSkipp() {
        extentTest = extent.createTest("Skip test");
        extentTest.log(Status.SKIP, "Test method skiped");
    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        extent.flush();
    }
}
