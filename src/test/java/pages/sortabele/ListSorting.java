package pages.sortabele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.*;

public class ListSorting extends TestBase {
    By selectable1 = By.cssSelector("#sortable > li");
    By result = By.id("select-result");

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/sortable.php");


        List<WebElement> webElementLists = driver.findElements(selectable1);
        List<Integer> myRandomList = generateRandomList();

        /**
         * It is only idea. It' easy ;) Problem has not solved yet.
         */
        for (int i = 1; i <= 7; i++) {
            Integer pos = myRandomList.get(i - 1);
            if (!(webElementLists.get(i - 1).getText().contains(String.valueOf(pos)))) {
                moveRow(i, myRandomList.get(i-1));
            }
        }

        System.out.println(myRandomList);

//        for (int i = 1; i <= 6; i++)
//            for (int j = 2; j <= 7; j++) {
//                System.out.println(i + "\t" + j);
//                moveRow(i, j);
//                Thread.sleep(250);
//            }
        //System.out.println(myRandomList);

        Thread.sleep(10000);
    }

    void displayElement(List<WebElement> webElementLists) {
        for (int i = 0; i < webElementLists.size(); i++) {
            System.out.println(webElementLists.get(i).getText());
        }
    }

    void moveRow(int posFrom, int posDest) {
        Actions act = new Actions(driver);
        WebElement from = driver.findElement(By.cssSelector("main[class='container'] li:nth-child(" + posFrom + ")"));
        WebElement destinations = driver.findElement(By.cssSelector("main[class='container'] li:nth-child(" + posDest + ")"));
        act.dragAndDrop(from, destinations).build().perform();
    }

    List<Integer> generateRandomList() {
        List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collections.shuffle(mylist);
        return mylist;
    }
}