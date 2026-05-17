package pack1.tutorial40;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class Customer4Steps {

    private final Scenario4Context scenarioContext = new Scenario4Context();
    private String customerJson;

    @Given("base customer json is loaded from template")
    public void baseCustomerJsonIsLoaded() {

        String json = Resource4Utils.readClasspath("tutorial4/customer_base_simple.json");

        scenarioContext.put("customerJson", json);

        log.info("BASE JSON:\n{}", json);
    }

    @When("I create customer with data:")
    public void iCreateCustomerWithData(DataTable dataTable) {

        Map<String, String> map =
                dataTable.transpose().asMap(String.class, String.class);

        log.info("MAP FROM DATATABLE:\n{}", map);

        String baseJson = scenarioContext.getString("customerJson");

        String patchedJson = JsonBody4Patcher.patch(baseJson, map);

        scenarioContext.put("customerJson", patchedJson);
    }

    @When("I create customer json from map:")
    public void iCreateCustomerJsonFromMap(DataTable dataTable) {
        Map<String, String> map = dataTable.transpose().asMap(String.class, String.class);

        log.info("MAP 2 FROM DATATABLE:\n{}", map);
        customerJson = JsonBody4Patcher.createNestedJsonFromMap(map);
        log.info("JSON CREATED FROM MAP:\n{}", customerJson);

    }

    @Then("print final customer json")
    public void printFinalCustomerJson() {

        String finalJson = scenarioContext.getString("customerJson");
        log.info("FINAL CUSTOMER JSON:\n{}\n", finalJson);
    }

    @Then("print final customer json v2")
    public void printFinalCustomerJsonv2() {

        System.out.println("------------");
        log.info("FINAL CUSTOMER JSON v2:\n{}\n", customerJson);
        System.out.println("------------");
    }
}
