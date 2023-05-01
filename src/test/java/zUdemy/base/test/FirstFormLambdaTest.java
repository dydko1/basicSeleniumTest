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

    @Test
    void fillForm6() {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda6();
    }

    @Test
    void fillForm7() {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda7();
    }

    @Test
    void fillForm8() {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda8();
    }

    @Test
    void fillForm9() {
        FormPageLambda formPageLambda1 = new FormPageLambda(driver);
        formPageLambda1.lambda9();
    }
}
