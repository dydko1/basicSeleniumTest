package pack1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
    private final TestContext context; // Instancja TestContext

    public UserSteps(TestContext context) {
        this.context = context; // Wstrzyknięcie Contextu
    }

    @Given("Nowy użytkownik został zarejestrowany z domyślnym saldem {string}")
    public void userSubmitsAValidRegistrationFormHeader(String s) {
        String newUserId = "USER_123";
        String tempPassword = "TempPassword123";

        // Zapisanie danych do Contextu JEST ZACHOWANE
        context.setUserId(newUserId);
        context.setUserPassword(tempPassword);

        System.out.println("[GIVEN] Zarejestrowano użytkownika ID: " + newUserId
                + " (Saldo z kroku Gherkin: " + s + ")");
    }
}
