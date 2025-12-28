package pack1.tutorial3;

import static org.assertj.core.api.Assertions.assertThat;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class Customer1Steps {

    private final Scenario1Context ctx = new Scenario1Context();

    @Given("context customerId is {string}")
    public void contextCustomerIdIs(String customerId) {
        ctx.put("customerId", customerId);
    }

    @And("base request body from template {string}")
    public void baseRequestBodyFromTemplate(String templateFile) {
        String body = Resource1Utils.readClasspath("templates/" + templateFile);
        ctx.put("requestBody", body);
    }

    @And("patch request body1 with:")
    public void patchRequestBodyWith(DataTable table) {
        Map<String, String> patch = table.asMap(String.class, String.class);

        String baseBody = ctx.get("requestBody", String.class);
        String patchedBody = JsonBody1Patcher.applyPatch(baseBody, patch, ctx);
        ctx.put("requestBody", patchedBody);

    }

    @Then("json path {string} should equal {string}")
    public void jsonPathShouldEqual(String jsonPath, String expected) {
        String body = ctx.get("requestBody", String.class);
        Object actual = JsonPath.parse(body).read(jsonPath);
        assertThat(String.valueOf(actual)).isEqualTo(expected);
    }

    @Then("patched body should contain text {string}")
    public void patchedBodyShouldContainText(String needle) {
        String body = ctx.get("requestBody", String.class);
        assertThat(body).contains(needle);
    }
}
