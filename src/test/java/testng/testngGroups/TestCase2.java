package testng.testngGroups;

import org.testng.annotations.Test;

public class TestCase2 {
    @Test(groups = {"functionalTest"}, enabled = true)
    public void composeMail() {
        System.out.println("Mail Sent");
    }
}