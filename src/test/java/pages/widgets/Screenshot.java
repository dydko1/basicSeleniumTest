package pages.widgets;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Screenshot extends TestBase {
    By scroll = By.cssSelector(".media__link[href='https://www.bbc.com/culture/article/20220708-how-better-call-saul-bettered-breaking-bad']");

    @Test
    void selectRandomRow() throws InterruptedException {
        driver.get("https://www.bbc.com/");
        captureScreen();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll);
        Thread.sleep(1500);
    }

    void  captureScreen() {
        String path;
        try {
            WebDriver augmentedDriver = new Augmenter().augment(driver);
            File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
            path = "./target/screenshots/" + source.getName();
            FileUtils.copyFile(source, new File(path));
        }
        catch(IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }
        System.out.println( path);
    }
}