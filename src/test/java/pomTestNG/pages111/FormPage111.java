package pomTestNG.pages111;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pomTestNG.pages111.base.BasePage111;

import java.util.Random;

public class FormPage111 extends BasePage111 {
    public FormPage111(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inputFirstName3")
    WebElement inputFirstName;
    // By inputFirstName = By.id("inputFirstName3");
    By inputLastName = By.id("inputLastName3");
    By inputEmail = By.id("inputEmail3");
    By radioMale = By.id("gridRadiosMale");
    By inputAge = By.id("inputAge3");
    By radioYearOfExperience = By.cssSelector("input[name='gridRadiosExperience'][value='2']");
    By inputProfession = By.id("gridCheckAutomationTester");
    By inputContinent = By.id("selectContinents");
    By selectCommands = By.id("selectSeleniumCommands");
    By inputFile = By.id("chooseFile");
    By buttonSignIn = By.cssSelector("button[type='submit'][class='btn btn-primary']");
    By validMessage = By.cssSelector("form > div:last-child > div:last-child");

    public void fillForm11() {
        driver.get("https://seleniumui.moderntester.pl/form.php");

        inputFirstName.sendKeys("Miroslaw");
        driver.findElement(inputLastName).sendKeys("Dyduch");
        driver.findElement(inputEmail).sendKeys("dydlkp@w.pl");
        driver.findElement(radioMale).click();
        driver.findElement(inputAge).sendKeys("21");
        driver.findElement(radioYearOfExperience).click();
        driver.findElement(inputProfession).click();

        Select sel1 = new Select(driver.findElement(inputContinent));
        Random random = new Random();
        sel1.selectByIndex((random.nextInt(sel1.getOptions().size() - 1)) + 1);

        Select sel = new Select(driver.findElement(selectCommands));
        sel.selectByIndex(1);

        WebElement element = driver.findElement(inputFile);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(inputFile).sendKeys("C:\\temp\\file.txt");

        driver.findElement(buttonSignIn).click();
        //Thread.sleep(2000);
        element = driver.findElement(validMessage);
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        assert (driver.findElement(validMessage).getText().contentEquals("Form send with success"));
    }
}
