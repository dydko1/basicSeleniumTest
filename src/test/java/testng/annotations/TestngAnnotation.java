package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {

    // Test Case 1
    @Test
    public void testCase1() {
        System.out.println("in Test Case 1!!!!!!!!!!!!!!!!!!!!");
    }

    // Test Case 2
    @Test
    public void testCase2() {
        System.out.println("in Test Case 2!!!!!!!!!!!!!!!!!!!!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in After Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in After Suite");
    }

}