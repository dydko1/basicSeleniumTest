package pomTestNG.test111;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pomTestNG.pages111.TablePage111;
import pomTestNG.test111.base.BaseTest111;

public class TableFormTest111 extends BaseTest111 {

    @Ignore
    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        TablePage111 formPage11 = new TablePage111(driver);

        formPage11.fillForm11();
        Thread.sleep(1500);
    }

}
