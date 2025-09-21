package pack1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps {

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("Step 1: User navigates to the login page.");
        // Code to navigate to the login page
    }

    @When("the user enters {string} as username and {string} as password")
    public void userEntersCredentials(String username, String password) {
        System.out.printf("Step 2: User enters username '%s' and password '%s'.\n", username, password);
        // Code to enter username and password into the fields
    }

    @And("the user clicks the login button")
    public void userClicksLoginButton() {
        System.out.println("Step 3: User clicks the login button.");
        // Code to click the login button
    }

    @Then("the user should see the message {string}")
    public void userShouldSeeMessage(String expectedMessage) {
        System.out.printf("Step 4: Verifying that the message '%s' is displayed.\n", expectedMessage);
        // Code to verify that the expected message is displayed on the screen
    }
}