package pack1;

import com.jayway.jsonpath.JsonPath;
import demo.JsonBodyPatcher;
import demo.ScenarioContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerSteps {

  private final ScenarioContext ctx = new ScenarioContext();

  @Given("base customer request body")
  public void baseCustomerRequestBody() {
    // kontekst: cos, co zwykle przychodzi z poprzednich stepow (np. ID z API)
    ctx.put("customerId", "CUST-123");
    ctx.put("customerId2", "CUST-12345677");


    String baseJson = """
      {
        "customer": { "firstName": "", "lastName": "" },
        "customerId": "",
        "communicationData": { "email": "" }
      }
      """;

    ctx.put("requestBody", baseJson);
  }

  @And("patch request body with:")
  public void patchRequestBodyWith(DataTable table) {
    // DataTable -> Map<String, String>
    // (2 kolumny: key | value)
    Map<String, String> patch = table.asMap(String.class, String.class);

    String baseBody = ctx.get("requestBody", String.class);
    String patched = JsonBodyPatcher.applyPatch(baseBody, patch, ctx);

    ctx.put("requestBody", patched);
  }

  @Then("patched JSON should have {string} at {string}")
  public void patchedJsonShouldHaveAt(String expectedValue, String jsonPath) {
    String body = ctx.get("requestBody", String.class);

    String actual = JsonPath.parse(body).read(jsonPath, String.class);

    assertThat(actual).isEqualTo(expectedValue);
  }
}