package training.testng1;

import org.testng.annotations.*;


public class TestNGLoop {
    @Test
    public void testCase1() {
        System.out.println("This is Test Case 1");
    }

    @Test(invocationCount = 5, groups = { "bonding", "strong_ties" })
    public void testCase2() {
        System.out.println("This is Test Case 2");
    }


}