package pack1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class DataTableWithoutHeaderStep {

    private boolean isValid;

    @Given("User submits a valid registration form 1")
    public void userSubmitsAValidRegistrationForm(List<String> dataTable) {

        // Używamy asLists(String.class) do konwersji DataTable na List<List<String>>.
        // Oczekujemy, że mamy tylko jeden wiersz w tabeli.
//        List<String> signUpForm = dataTable.asList(String.class);
        for (String x : dataTable) {
            System.out.println(x);
        }
    }

    @Given("User submits a valid registration form 2")
    public void userSubmitsAValidRegistrationForm2(DataTable dataTable) {

        // Używamy asLists(String.class) do konwersji DataTable na List<List<String>>.
        // Oczekujemy, że mamy tylko jeden wiersz w tabeli.
        List<String> signUpForm = dataTable.asList(String.class);
        for (String x : signUpForm) {
            System.out.println(x);
        }
    }

    @Then("System proceeds with registration")
    public void systemProceedsWithRegistration() {
        System.out.println("\n------------------------- Bye bye -------------------------\n");
    }
}
