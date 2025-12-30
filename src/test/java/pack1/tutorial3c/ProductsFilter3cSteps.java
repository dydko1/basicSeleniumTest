package pack1.tutorial3c;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class ProductsFilter3cSteps {

    private final Scenario3cContext ctx = new Scenario3cContext();

    @Given("C3 products json includes code B2 with price {int}")
    public void productsJsonIncludesCodeB2WithPrice(int price) {
        String json = """
      {
        "products": [
          { "code": "A1", "price": 100 },
          { "code": "B2", "price": %d }
        ]
      }
      """.formatted(price);

        ctx.put("json", json);
    }

    // Bezpieczny ASSERT: filtr -> lista obiektow -> pierwszy match -> pole
    @Then("C3 product with code {string} should have price {int} using filter")
    public void productWithCodeShouldHavePriceUsingFilter(String code, int expectedPrice) {
        String json = ctx.get("json");

        List<Map<String, Object>> matches =
                JsonPath.parse(json).read("$.products[?(@.code=='" + code + "')]");

        if (matches.isEmpty()) {
            fail("No product found for code=" + code);
        }

        Object price = matches.get(0).get("price");
        assertThat(((Number) price).intValue()).isEqualTo(expectedPrice);
    }

    // Jeśli KONIECZNIE chcesz pisać "json path ... should equal ...", to użyj wariantu price[0]
    @Then("C3 json path price for code {string} should equal {string}")
    public void jsonPathPriceForCodeShouldEqual(String code, String expected) {
        String json = ctx.get("json");

        // Zwraca liste cen, np. [250]
        Object actual = JsonPath.parse(json).read("$.products[?(@.code=='" + code + "')].price[0]");
        assertThat(String.valueOf(actual)).isEqualTo(expected);
    }
}
