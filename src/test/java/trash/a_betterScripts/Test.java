package trash.a_betterScripts;

public class Test extends BaseClass {

    @org.testng.annotations.Test(description = "This TC will perform valid login")
    public void test111() throws Throwable {
        LoginTest111 invalidLogin = new LoginTest111();

        invalidLogin.loginToApplication();
        Thread.sleep(1000);
    }


}