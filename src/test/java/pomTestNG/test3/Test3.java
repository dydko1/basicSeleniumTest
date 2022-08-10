package pomTestNG.test3;

import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void successTest3() {
        System.out.println("Success. Message is from test3.");
    }

    @Test
    public void failedTest32() {
        System.out.println("Failed. Message is from test3.");
    }
}