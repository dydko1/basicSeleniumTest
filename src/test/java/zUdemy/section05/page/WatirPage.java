package zUdemy.section05.page;

import org.openqa.selenium.*;
import zUdemy.base.page.BasePage11;

public class WatirPage extends BasePage11 {
    public WatirPage(WebDriver driver) {
        super(driver);
    }

    public void getNestedElement() {
        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.id("shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
        SearchContext sc = shadowContent.getShadowRoot();
        System.out.println(sc.findElement(By.cssSelector("div")).getText());


//        WebElement shadowHost1 = driver.findElement(By.id("shadow_host"))
//                .getShadowRoot()
//                //.findElement(By.cssSelector("#nested_shadow_host"))
//                //.getShadowRoot()
//                .findElement(By.linkText("scroll.html"));

        //shadowHost1.click();
        //System.out.println("dddd");

        //String text = shadowRoot.findElement(By.cssSelector("#shadow_content > span")).getText();
        //System.out.println(text);

        //System.out.println(driver.findElement(input).getText());
        //driver.findElement(password).sendKeys("rahulshettyacademy");
        //driver.findElement(loginButton).click();
    }

    public void getNestedElementJS() {
        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.id("shadow_host"));
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].shadowRoot", shadowHost);
        //WebElement we = shadowRoot.findElement(By.cssSelector("#shadow_content > span"));
        WebElement we = shadowRoot.findElement(By.cssSelector("a[href='scroll.html']"));
        //we.click();

        WebElement we1 = (WebElement) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].shadowRoot", we);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", we);
        //we1.click();
        //System.out.println(we.getText());
    }
}