package pack1;

import org.testng.annotations.Test;

public class TestNGAnnGroups1 {
    @Test(description = "This is testcase 111 desc", groups = {"func", "sanity"})
    public void test1() {
        System.out.println("Message1: This is testcase1 desc. \tfunc\tsanity");
    }

    @Test(description = "This is testcase 222 desc",groups = "miro1")
    public void test2() {
        System.out.println("Message2: This is testcase2 desc. \tMiro1");
    }
}
