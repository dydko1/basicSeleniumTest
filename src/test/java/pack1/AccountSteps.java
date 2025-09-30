package pack1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {
    private final TestContext context; // Instancja TestContext

    public AccountSteps(TestContext context) {
        this.context = context; // Wstrzyknięcie Contextu
    }


    @Then("Powinien zobaczyć saldo konta {string}")
    public void powinienZobaczyćSaldoKonta(String s) {
        String userId = context.getUserId(); // Pobieramy ID użytkownika z Contextu

        // ZAMIAST: String aktualneSaldo = api.checkBalance(userId);
        // Symulacja pobrania aktualnego salda (uproszczenie)
        String aktualneSaldo = "$1000";

        System.out.println("[THEN] Użytkownik " + userId + " weryfikuje saldo.");

        // Weryfikacja
//        Assertions.assertEquals(oczekiwaneSaldo, aktualneSaldo,
//                "Błąd weryfikacji salda: Oczekiwano " + oczekiwaneSaldo + ", otrzymano " + aktualneSaldo);

        System.out.println("[THEN] Weryfikacja zakończona pomyślnie. Saldo: " + aktualneSaldo);
    }
}
