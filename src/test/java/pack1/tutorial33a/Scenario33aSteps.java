package pack1.tutorial33a;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class Scenario33aSteps {

    private final Scenario33aContext ctx = new Scenario33aContext();

    @Given("A33 a simple customer json with id {string}")
    public void aSimpleCustomerJsonWithId(String customerId) {
        String myRequest = """
                {
                  "customerId": "%s",
                  "customer": { "firstName": "Jan", "lastName": "Kowalski" }
                }
                """.formatted(customerId);
        ctx.put("request", myRequest);
    }

    @Then("A33 json path {string} should equal {string}")
    public void jsonPathShouldEqual(String jsonPath, String expected) {
        String actual = JsonPath
                .parse(ctx.get("request").toString())
                .read(jsonPath);
        assertThat(actual).isEqualTo(expected);
    }
}