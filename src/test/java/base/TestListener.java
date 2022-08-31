package base;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestListener implements ITestListener {

    //ExtentTest test;
    WebDriver driver = null;
    String filePath = "C:\\Users\\mdyduch\\Documents\\javaTutorials\\JavaTrainings\\selenumBasic\\TestReport";
    private static String fileSeperator = System.getProperty("file.separator");

    public void onStart(ITestContext context) {
        System.out.println("*** Test Suite " + context.getName() + " started ***");
    }

    public void onFinish(ITestContext context) {
        System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
        ExtentTestManager.endTest();
        ExtentManager.getInstance().flush();
    }

    public void onTestStart(ITestResult result) {
        System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
        ExtentTestManager.getTest().log(Status.PASS, "Test passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
    }

    //it does not work
//    @Override
    public void onTestFailure3(ITestResult result) {
        System.out.println("***** Error " + result.getName() + " test has failed *****");
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
        String methodName = result.getName().toString().trim();
        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver)context.getAttribute("driver");
        takeScreenShot(methodName, driver);
    }

    public void takeScreenShot(String methodName, WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
            System.out.println("***Placed screen shot in " + filePath + " ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    @Override
    public void onTestFailure2(ITestResult result) {
        System.out.println("***** Error " + result.getName() + " test has failed *****");
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");

        String testClassName = getTestClassName(result.getInstanceName()).trim();

        String testMethodName = result.getName().toString().trim();
        String screenShotName = testMethodName + ".png";

        if (driver != null) {
            String imagePath = ".." + fileSeperator + "Screenshots"
                    + fileSeperator + "Results" + fileSeperator + testClassName
                    + fileSeperator
                    + takeScreenShot(driver, screenShotName, testClassName);
            System.out.println("Screenshot can be found : " + imagePath);
        }
    }

    public static String takeScreenShot(WebDriver driver,
                                        String screenShotName, String testName) {
        try {
            File file = new File("Screenshots" + fileSeperator + "Results");
            if (!file.exists()) {
                System.out.println("File created " + file);
                file.mkdir();
            }

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File targetFile = new File("Screenshots" + fileSeperator + "Results" + fileSeperator + testName, screenShotName);
            FileUtils.copyFile(screenshotFile, targetFile);

            return screenShotName;
        } catch (Exception e) {
            System.out.println("An exception occured while taking screenshot " + e.getCause());
            return null;
        }
    }

    public String getTestClassName(String testName) {
        String[] reqTestClassname = testName.split("\\.");
        int i = reqTestClassname.length - 1;
        System.out.println("Required Test Name : " + reqTestClassname[i]);
        return reqTestClassname[i];
    }

//    public void onTestFailure(ITestResult result) {
//        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
//        test = extent.createTest("Test Case 2", "PASSED test case");
//        test.info("*** Test execution " + result.getMethod().getMethodName() + " failed...");
//        test.info((result.getMethod().getMethodName() + " failed!"));
//
//        ITestContext context = result.getTestContext();
//        WebDriver driver = (WebDriver) context.getAttribute("driver");
//
//        String targetLocation = null;
//
//        //String testClassName = "bbbbb"; //getTestClassName(result.getInstanceName()).trim();
//        //String timeStamp = "aaa";//Util.getCurrentTimeStamp(); // get timestamp
//        String testMethodName = result.getName().toString().trim();
//        String screenShotName = testMethodName +  ".png";
//        String fileSeperator = System.getProperty("file.separator");
//        String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
//                + "screenshots";
//        test.info("Screen shots reports path - " + reportsPath);
//        try {
//            File file = new File(reportsPath + fileSeperator ); // Set
//            // screenshots
//            // folder
//            if (!file.exists()) {
//                if (file.mkdirs()) {
//                    test.info("Directory: " + file.getAbsolutePath() + " is created!");
//                } else {
//                    test.info("Failed to create directory: " + file.getAbsolutePath());
//                }
//            }
//
//            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            targetLocation = reportsPath + fileSeperator +  fileSeperator + screenShotName;// define
//            // location
//            File targetFile = new File(targetLocation);
//            test.info("Screen shot file location - " + screenshotFile.getAbsolutePath());
//            test.info("Target File location - " + targetFile.getAbsolutePath());
//            FileHandler.copy(screenshotFile, targetFile);
//
//        } catch (FileNotFoundException e) {
//            test.info("File not found exception occurred while taking screenshot " + e.getMessage());
//        } catch (Exception e) {
//            test.info("An exception occurred while taking screenshot " + e.getCause());
//        }
//
//// attach screenshots to report
////        try {
////            ExtentTestManager.getTest().fail("Screenshot",
//                    MediaEntityBuilder.createScreenCaptureFromPath(targetLocation).build();
////        } catch (IOException e) {
////            test.info("An exception occured while taking screenshot " + e.getCause());
////        }
//        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
//
//    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
    }

}