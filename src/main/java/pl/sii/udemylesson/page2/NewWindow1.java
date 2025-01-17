package pl.sii.udemylesson.page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.sii.udemylesson.page1.BasePageA;
import java.util.Iterator;
import java.util.Set;

public class NewWindow1 extends BasePageA {

    public NewWindow1(WebDriver driver) {
        super(driver);
    }

    public void fillForm() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
        Thread.sleep(1000);
    }
}