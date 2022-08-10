package pages.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.*;

public class WindowTabs1 extends TestBase {
    By buttonNewWindow = By.id("newBrowserWindow");
    By buttonNewMessage = By.id("newMessageWindow");
    By buttonNewBrowserTab = By.id("newBrowserTab");
    By tableTbody = By.cssSelector("table > tbody");
    By bodyText = By.cssSelector("body");

    WebElement big = driver.findElement(By.cssSelector("div[class*='Big']"));
    WebElement medium = big.findElement(By.cssSelector("div[class*='Medium']"));
    WebElement small = medium.findElement(By.cssSelector("div[class*='Small')]"));

    @Test
    public void openNewBrowserWindow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();

        driver.findElement(buttonNewWindow).click();
        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        while (i.hasNext()) {
            String child_window = i.next();
            if (!child_window.equalsIgnoreCase(current_Window)) {
                driver.switchTo().window(child_window);
                System.out.println("The current window is " + child_window);
                // close() method closes the child window in focus, the parent window is still open
                //driver.close();
            } else {
                System.out.println("No other window open");
            }
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(tableTbody));

        for (WebElement tr1 : driver.findElement(tableTbody).findElements(By.cssSelector("tr"))) {
            int height = Integer.valueOf(tr1.findElements(By.cssSelector("td:nth-of-type(4)")).get(0).getText());
            if ((tr1 != null) && (tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText().contains("Switzerland")) && (height > 4000))
                System.out.println(
                        tr1.findElements(By.cssSelector("td:nth-of-type(1)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(2)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText());
        }

        Thread.sleep(3000);
    }

    @Test
    public void openNewMessageWindow() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();

        driver.findElement(buttonNewMessage).click();

        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        while (i.hasNext()) {
            String child_window = i.next();
            if (!child_window.equalsIgnoreCase(current_Window)) {
                driver.switchTo().window(child_window);
                System.out.println("The current window is " + child_window);
                // close() method closes the child window in focus, the parent window is still open
                //driver.close();
            } else {
                System.out.println("No other window open");
            }
        }

        System.out.println(driver.findElement(bodyText).getText());

        Thread.sleep(3000);
    }

    @Test
    public void openNewBrowserTab() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();

        driver.findElement(buttonNewBrowserTab).click();

        String originalWindow = driver.getWindowHandle();
        //wait.until(numberOfWindowsToBe(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(tableTbody));

        for (WebElement tr1 : driver.findElement(tableTbody).findElements(By.cssSelector("tr"))) {
            int height = Integer.valueOf(tr1.findElements(By.cssSelector("td:nth-of-type(4)")).get(0).getText());
            if ((tr1 != null) && (tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText().contains("Switzerland")) && (height > 4000))
                System.out.println(
                        tr1.findElements(By.cssSelector("td:nth-of-type(1)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(2)")).get(0).getText() + "\t" +
                                tr1.findElements(By.cssSelector("td:nth-of-type(3)")).get(0).getText());
        }

        Thread.sleep(3000);
    }

    @Test
    public void openNewCloseBrowserWindows() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();
        driver.findElement(buttonNewWindow).click();
        driver.switchTo().window(current_Window);

        driver.findElement(buttonNewMessage).click();

        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        Thread.sleep(2500);
        String win1 = i.next();
        String win2 = i.next();
        String win3 = i.next();

        driver.switchTo().window(win1);
        Thread.sleep(2500);
        driver.switchTo().window(win2);
        Thread.sleep(2500);
        driver.switchTo().window(win3);
        Thread.sleep(2500);

        driver.switchTo().window(win1);
        Thread.sleep(2500);
        driver.switchTo().window(win2);
        Thread.sleep(2500);
        driver.switchTo().window(win3);
        Thread.sleep(2500);

        driver.switchTo().window(win1);
        Thread.sleep(2500);
        driver.switchTo().window(win2);
        Thread.sleep(2500);
        driver.switchTo().window(win3);
        Thread.sleep(2500);

        while (i.hasNext()) {
            String child_window = i.next();
            if (!child_window.equalsIgnoreCase(current_Window)) {
                driver.switchTo().window(child_window);
                System.out.println("The current window is " + child_window);
                // close() method closes the child window in focus, the parent window is still open
                Thread.sleep(500);
                driver.close();
            } else {
                System.out.println("No other window open");
            }
        }
        Thread.sleep(1000);
    }

    @Test
    public void openNewCloseBrowserWindows1() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();
        driver.findElement(buttonNewWindow).click();
        driver.switchTo().window(current_Window);

        driver.findElement(buttonNewMessage).click();

        Random rnd = new Random();
        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        List<String> child_windows = new ArrayList<>();

        while (i.hasNext()) {
            child_windows.add(i.next());
        }

        for (int j = 0; j < 100; j++) {
            //driver.switchTo().window(child_windows.get(rnd.nextInt(child_windows.size() )));
            driver.switchTo().window(child_windows.get(0));
            driver.switchTo().window(child_windows.get(1));
            driver.switchTo().window(child_windows.get(2));
            //System.out.println((child_windows.size()));
            Thread.sleep(100);
        }
        Thread.sleep(1000);
    }
}