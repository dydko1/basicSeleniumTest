package pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.base.TestBase;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class WindowTabs extends TestBase {
    By buttonNewWindow = By.id("newBrowserWindow");

    @Test
    public void clickSimpleAlert() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");
        String current_Window = driver.getWindowHandle();

        driver.findElement(buttonNewWindow).click();

        Set<String> all_Windows = driver.getWindowHandles();
        Iterator<String> i = all_Windows.iterator();

        while(i.hasNext()){
            String child_window = i.next();
            if(!child_window.equalsIgnoreCase(current_Window)){
                driver.switchTo().window(child_window);
                System.out.println("The current window is "+child_window);
                // close() method closes the child window in focus, the parent window is still open
                driver.close();
            } else {
                System.out.println("No other window open");
            }
        }
        driver.switchTo().window(all_Windows.iterator().next());
        Thread.sleep(2000);
        driver.close();

        Thread.sleep(3000);
    }
}