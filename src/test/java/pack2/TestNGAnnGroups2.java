package pack2;

import org.testng.annotations.Test;

public class TestNGAnnGroups2 {
    @Test(description = "This is testcase 333 desc", groups = {"func2", "sanity2"})
    public void test1() {
        System.out.println("Message3: This is testcase1 desc. \tfunc2\tsanity2");
    }

    @Test(description = "This is testcase 444 desc",groups = {"miro2","regr"})
    public void test2() {
        System.out.println("Message4: This is testcase2 desc. \tMiro12");
    }
}
