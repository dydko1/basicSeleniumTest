package test4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGTest {
    BusinessClass businessClass = new BusinessClass();

    @BeforeMethod
    public void setUp() {
        businessClass.run();
    }

    @Test
    public void testInTestNG1() {
        System.out.println("First test");
        assertEquals(businessClass.concat("Java"), "Java");
    }

    @Test
    public void testInTestNG2() {
        System.out.println("Second test");
        assertEquals(businessClass.concat("Java", "17"), "Java 17");
    }

//    @Test
//    public void testInTestNG3() {
//        System.out.println("Third test");
//        assertEquals(businessClass.concat("Java", "17"), "Java");
//    }

    @AfterMethod
    public void tearDown() {
        businessClass.stop();
    }
}