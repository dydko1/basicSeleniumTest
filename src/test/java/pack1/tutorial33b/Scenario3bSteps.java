package pack1.tutorial33b;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Scenario3bSteps {

    private final Scenario3bContext ctx = new Scenario3bContext();

    @Given("B3 products json with first price {int}")
    public void bProductsJsonWithFirstPrice(int price) {
        String myRequest = """
                {
                  "products": [
                    { "code": "A1", "price": %d },
                    { "code": "B2", "price": 200 }
                  ]
                }
                """.formatted(price);
        ctx.put("request", myRequest);
    }

    @When("B3 json path {string} should equal {string}")
    public void jsonPathShouldEqual(String jsonPath, String expected) {
        String json = ctx.get("request");
        Object actual = JsonPath.parse(json).read(jsonPath);

        if (actual instanceof java.util.List<?> list) {
            if (list.isEmpty()) {
                throw new AssertionError("JsonPath returned empty list for: " + jsonPath);
            }
            actual = list.get(0);
        }

        assertThat(String.valueOf(actual)).isEqualTo(expected);
    }
}
