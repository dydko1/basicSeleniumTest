package pack2;

import org.testng.annotations.Test;

public class TestNGAnnGroups3 {
    @Test(description = "This is testcase 333 desc", groups = {"func3", "sanity3"})
    public void test1() {
        System.out.println("Message3!!!!: This is testcase1 desc. \tfunc2\tsanity333");
    }

    @Test(description = "This is testcase 444 desc",groups = {"miro3","regr3"})
    public void test2() {
        System.out.println("Message4!!!!!: This is testcase2 desc. \tMiro333");
    }
}
