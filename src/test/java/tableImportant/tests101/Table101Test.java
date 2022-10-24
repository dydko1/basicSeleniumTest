package tableImportant.tests101;

import _workingPOM.test.BaseTest;
import org.testng.annotations.Test;
import tableImportant.pages101.MountainRowPage;
import tableImportant.pages101.MountainsTablePage;

public class Table101Test extends BaseTest {

    @Test
    public void checkTable() throws InterruptedException {
        driver.get("http://51.75.61.161:9102/");

        for (MountainRowPage mountain : new MountainsTablePage(driver).getAllMountains()) {
            if (mountain.getHeight() > 4000) {
                System.out.println(mountain.toString());
            }
        }

        Thread.sleep(2000);
    }

}
