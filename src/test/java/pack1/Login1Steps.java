package pack1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Steps {
    private final TestContext context; // Instancja TestContext

    public Login1Steps(TestContext context) {
        this.context = context; // Wstrzyknięcie Contextu
    }

    @When("Użytkownik loguje się do systemu")
    public void użytkownikLogujeSięDoSystemu() {
        // Pobieranie danych z Contextu JEST ZACHOWANE
        String userId = context.getUserId();
        String password = context.getUserPassword();

        // ZAMIAST: api.login(userId, password);
        // Symulacja akcji:
        System.out.println("[WHEN] Próba logowania użytkownika ID: " + userId
                + " z hasłem: " + password);

        // Możesz symulować zapis tokena, jeśli jest potrzebny w kroku Then
        // context.setSessionToken("TOKEN_XYZ");
    }
}
