package pomTestNG.pages111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomTestNG.pages111.base.BasePage111;

import java.util.List;

public class TablePage111 extends BasePage111 {
    public TablePage111(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //    @FindBy(css = "tbody")
//    WebElement tbodyTable;
    @FindBy(css = "tr")
    List<WebElement> tr;

    public void fillForm11() {
        driver.get("https://seleniumui.moderntester.pl/table.php");


        for (WebElement w : tr) {
            System.out.println(w.getText());
        }

//        for (WebElement w : tbodyTable.findElements(By.cssSelector("tr"))) {
//            System.out.println(w.getText());
//        }

    }
}
