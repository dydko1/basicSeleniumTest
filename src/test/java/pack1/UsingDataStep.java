package pack1;

import io.cucumber.java.en.Given;

public class UsingDataStep {

    @Given("the following books")
    public void followingBooks() {
        System.out.println("Step 1: User navigates to the login page.");
        // Code to navigate to the login page
    }
}