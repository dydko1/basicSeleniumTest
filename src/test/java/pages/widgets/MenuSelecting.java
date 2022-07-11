package pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.List;
import java.util.Random;

public class MenuSelecting extends TestBase {
    By dropDownSpeed = By.id("speed-button");
    By dropDownSpeedList = By.cssSelector("#speed-menu > li > div");
    By files = By.id("files-button");
    By filesMenu = By.cssSelector("#files-menu div[role='option']");
    By numberMenu = By.id("number-button");
    By numbersInMenu = By.cssSelector("#number-menu > li");


    @Test
    void selectRandomRow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");
        driver.findElement(dropDownSpeed).click();
        List<WebElement> speedElements = driver.findElements(dropDownSpeedList);
        selectSpeedList1(speedElements);
//        driver.findElement(progressBar).getText();
        Thread.sleep(5000);
    }

    @Test
    void selectByTextValueAndPos() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");

        driver.findElement(files).click();
        List<WebElement> fileMenElements = driver.findElements(filesMenu);

        selectByText(fileMenElements, "Some unknown file");
        Thread.sleep(5000);

        driver.findElement(files).click();
        selectByIndex(fileMenElements, 2);
        Thread.sleep(5000);
    }

    @Test
    void selectNumber() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");
        Random rnd = new Random();
        int rndIndex;
        driver.findElement(numberMenu).click();
        //Thread.sleep(500);
        List<WebElement> numbersInMenu1 = driver.findElements(numbersInMenu);

        numbersInMenu1.get(3).click();
        Thread.sleep(500);

        driver.findElement(numberMenu).click();
        rndIndex = rnd.nextInt(numbersInMenu1.size());
        numbersInMenu1.get(rndIndex).click();

        Thread.sleep(5000);
    }

    void selectByText(List<WebElement> fileMenEle, String text) {
        for (WebElement web : fileMenEle) {
            if (web.getText().contains(text)) {
                web.click();
                break;
            }
        }
    }

    void selectByIndex(List<WebElement> fileMenEle, int index) {
        System.out.println(fileMenEle.size());
        fileMenEle.get(1).click();
        //for (WebElement web : fileMenEle) {
        //    System.out.println(web.getText());
        // }
    }

    void selectSpeedList1(List<WebElement> speedElements) {
        Random rnd = new Random();
        int rndPos = rnd.nextInt(speedElements.size());

//        System.out.println(rndPos);
//        for (WebElement web : speedElements) {
//            System.out.println(web.getText());
//        }
        speedElements.get(rndPos).click();
    }
}