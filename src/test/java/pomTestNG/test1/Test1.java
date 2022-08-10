package pomTestNG.test1;

import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void successTest1(){
        System.out.println("Success. Message is from test1");
    }

    @Test
    public void failedTest11(){
        System.out.println("Failed. Message is from test1");
    }
}
