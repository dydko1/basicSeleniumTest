package zUdemy.base.page;

import lombok.val;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FormPageLambda extends BasePage11 {
    public FormPageLambda(WebDriver driver) {
        super(driver);
    }

    public void lambda1() {
        driver.get("http://demowebshop.tricentis.com");
        List<WebElement> links = driver.findElements(By.cssSelector(("a")));
        String s1 = String.format("There are %s links in text. Test1: %s %s, ", links.size(), "abc", "xxx");
        System.out.println(s1);
        List<String> filterLinks = links.stream().filter(a -> !a.getText().equals("")).map(el -> el.getText()).collect(Collectors.toList());
        filterLinks.forEach(System.out::println);
    }

    public void lambda2() {
        driver.get("http://demowebshop.tricentis.com/");

        List<WebElement> prodTitle = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<WebElement> prodPriceTitle = driver.findElements(By.xpath("//div[@class='prices']"));

        Map<String, Double> products_map = new HashMap<String, Double>();

        for (int i = 0; i < prodPriceTitle.size(); i++) {
            String title = prodTitle.get(i).getText();
            Double price = Double.parseDouble(prodPriceTitle.get(i).getText());
            products_map.put(title, price);
        }

        List<Double> s4 = products_map.entrySet().stream().map(s -> s.getValue()).collect(Collectors.toList());
        System.out.println("-------");
        s4.forEach(System.out::println);
        System.out.println("-------");
        System.out.println("Price products are bigger then > 1000");
        products_map.entrySet().stream().filter(e -> e.getValue() > 1000).forEach(System.out::println);
    }

    public void lambda3() {
        String xx = "aaaa";
        driver.get("http://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();

        Select sortbydrp = new Select(driver.findElement(By.id("products-orderby")));
        sortbydrp.selectByVisibleText("Name: Z to A");

        List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> beforeSort = product_items.stream().map(item -> item.getText()).collect(Collectors.toList());
        System.out.println("-----------------");
        List<String> afterSort = product_items.stream().map(a -> a.getText()).sorted().collect(Collectors.toList());
        System.out.println("-----------------");
        System.out.println(beforeSort);


        System.out.println();
    }

    public void lambda4() {

        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();

        Set<String> windowsId = driver.getWindowHandles();
        windowsId.forEach(a -> System.out.println(driver.switchTo().window(a).getTitle()));

        System.out.println("Test 4");
    }

    public void lambda5() {
        driver.get("http://demowebshop.tricentis.com/");

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println("----------");
        for (WebElement link : links) {
            //System.out.println(link.getText());
        }

        System.out.println("------------------------------------------");
        long worksLinks = links.stream().filter(s -> s.getAttribute("href") != null).count();
        System.out.println(worksLinks);
        System.out.println();
    }

    public void lambda6() {
        driver.get("http://demowebshop.tricentis.com/");
        List<WebElement> links = driver.findElements(By.xpath("//a"));

        List<String> worksLinks = links.stream().filter(l -> l.getAttribute("href") != null).map(l1 -> l1.getText()).collect(Collectors.toList());
    }

    public void lambda7() {
        driver.get("https://www.amazon.in/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/");//driver.navigate().to("https://www.flipkart.com/");

        Set<String> windowIds = driver.getWindowHandles(); // Here using Set collection

        for (String s : windowIds) {
            driver.switchTo().window(s);
            System.out.println("eeeeeeee.:\t" + s);
        }

        System.out.println("-----------------------");

        windowIds.forEach(s1 -> System.out.println(driver.switchTo().window(s1).getTitle()));
        System.out.println();
    }

    public void lambda8() {

        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();

        Select sortbydrp = new Select(driver.findElement(By.id("products-orderby")));
        sortbydrp.selectByVisibleText("Name: A to Z");
        List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> beforeSort = product_items.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> afterSort = product_items.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
        System.out.println("-----------");
        System.out.println("Before sort.:\t" + beforeSort);
        System.out.println("-----------");
        System.out.println("After sort.:\t" + afterSort);
    }

    public void lambda9() {
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        List<WebElement> prodTitles = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<WebElement> prodPrices = driver.findElements(By.xpath("//div[@class='prices']"));

        Map<String, Double> products_map = new HashMap<String, Double>();
        for (int i = 0; i < prodPrices.size(); i++) {
            products_map.put(prodTitles.get(i).getText(), Double.parseDouble(prodPrices.get(i).getText()));
        }
        System.out.println("**** Product price is > 800 using filer & lambda ****");
        products_map.entrySet().stream().filter(e->e.getValue()>300).forEach(v-> System.out.println(v));
    }
}
