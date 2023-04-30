package zUdemy.base.test;

import org.testng.annotations.Test;
import zUdemy.base.page.FormPageLambda;

public class FirstFormLambdaTest extends BaseTest {

    @Test(priority = 0)
    void fillForm1() throws InterruptedException {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda1();
    }

    @Test(priority = 0)
    void fillForm5() throws InterruptedException {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda5();
    }
}
