package pages.j4log;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.base.TestBase;
import utils.Log;


public class Slider11J4Log extends TestBase {
    By slider = By.id("custom-handle");

    //static
    //MyStaticClass myStaticClass;
    @Test
    void selectRandomRow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/slider.php");

        moveSlider(50);
        //myStaticClass.MyMessage();
        MyStaticClass.MyMessage("asd");
        MyStaticClass.MyMessage("asd1");
        Log.info("pos50");
        //Thread.sleep(500);
        moveSlider(80);
        Log.info("pos 80");
        //Thread.sleep(500);
        moveSlider(80);
        Log.info("pos 80");
        //Thread.sleep(500);
        moveSlider(20);
        Log.info("pos 20");
        //Thread.sleep(500);
        moveSlider(0);
        Log.info("pos 0");
        //Thread.sleep(500);
        moveSlider(100);
        Log.info("pos 100");
        //Thread.sleep(500);
        moveSlider(0);
        Log.info("pos 0");
        //Thread.sleep(2500);
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