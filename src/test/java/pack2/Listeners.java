package pack2;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
    @Override
    public void onTestStart(ITestResult tr) {
        System.out.println("Test Started....");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Test skipped");
    }

}
