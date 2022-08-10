package pomTestNG.test2;

import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void successTest2(){
        System.out.println("Success. Message is from test2.");
    }
    @Test
    public void failedTest22(){
        System.out.println("Failed. Message is from test2.");
    }
}
