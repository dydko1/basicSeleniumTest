package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.List;
import java.util.Random;

public class Slider11 extends TestBase {
    By slider = By.id("custom-handle");

    @Test
    void selectRandomRow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/slider.php");

        moveSlider(50);
        Thread.sleep(500);
        moveSlider(80);
        Thread.sleep(500);
        moveSlider(80);
        Thread.sleep(500);
        moveSlider(20);
        Thread.sleep(500);
        moveSlider(0);
        Thread.sleep(500);
        moveSlider(100);
        Thread.sleep(500);
        moveSlider(0);
        Thread.sleep(2500);
    }

    void moveSlider(int pos) {
        int actualPos;

        WebElement sliderPos = driver.findElement(slider);
        do {
            actualPos = Integer.valueOf(driver.findElement(slider).getText());

            if (actualPos < pos) {
                sliderPos.sendKeys(Keys.ARROW_RIGHT);
            } else if (actualPos > pos) {
                sliderPos.sendKeys(Keys.ARROW_LEFT);
            }
        }
        while (actualPos != pos);
    }
}