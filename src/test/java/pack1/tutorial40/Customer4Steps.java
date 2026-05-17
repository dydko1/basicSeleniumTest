package pack1.tutorial40;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Customer4Steps {

    private final Scenario4Context scenarioContext = new Scenario4Context();

    @Given("base customer json is loaded from template")
    public void baseCustomerJsonIsLoaded() {

        String json = Resource4Utils.readClasspath("tutorial4/customer_base_simple.json");

        scenarioContext.put("customerJson", json);

        System.out.println("BASE JSON:");
        System.out.println(json);
    }

    @When("I create customer with data:")
    public void iCreateCustomerWithData(DataTable dataTable) {

        Map<String, String> map =
                dataTable.transpose().asMap(String.class, String.class);

        System.out.println("MAP FROM DATATABLE:");
        System.out.println(map);

        String baseJson = scenarioContext.getString("customerJson");

        String patchedJson = JsonBody4Patcher.patch(baseJson, map);

        scenarioContext.put("customerJson", patchedJson);
    }

    @Then("print final customer json")
    public void printFinalCustomerJson() {

        String finalJson = scenarioContext.getString("customerJson");

        System.out.println("FINAL CUSTOMER JSON:");
        System.out.println(finalJson);
    }
}
