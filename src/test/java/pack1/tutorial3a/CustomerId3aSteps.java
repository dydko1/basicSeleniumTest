package pack1.tutorial3a;

import static org.assertj.core.api.Assertions.assertThat;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CustomerId3aSteps {

    private final Scenario3aContext ctx = new Scenario3aContext();

    @Given("a simple customer json with id {string}")
    public void aSimpleCustomerJsonWithId(String customerId) {
        String json = """
                {
                  "customerId": "%s",
                  "customer": { "firstName": "Jan", "lastName": "Kowalski" }
                }
                """.formatted(customerId);
        ctx.put("json", json);
    }

    @Then("new step json path {string} should equal {string}")
    public void jsonPathShouldEqual(String jsonPath, String expected) {
        Object actual = JsonPath.parse(ctx.get("json").toString()).read(jsonPath);
        assertThat(String.valueOf(actual)).isEqualTo(expected);
    }
}
