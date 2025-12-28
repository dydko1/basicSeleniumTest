Feature: Tutorial 3 - DataTable to JSON patch

  Scenario: Patch simple object fields + placeholders
    Given context customerId is "CUST-123"
    And base request body from template "customer_base.json"
    And patch request body1 with:
      | customer.firstName      | Jan                 |
      | customer.lastName       | Kowalski            |
      | customerId              | $context.customerId |
      | communicationData.email | $random.email       |
    Then json path "$.customer.firstName" should equal "Jan"
    Then json path "$.customerId" should equal "CUST-123"
    And patched body should contain text "@example.com"

  Scenario: Patch arrays by index and by key filter
    Given base request body from template "customers_array.json"
    And patch request body1 with:
      | customers[0].name   | Jan     |
      | customers[0].status | ACTIVE  |
      | customers[1].name   | Anna    |
      | customers[1].status | BLOCKED |
      | customers[2].name   | Tom     |
    Then json path "$.customers[1].status" should equal "BLOCKED"

    Given base request body from template "products_by_code.json"
    And patch request body1 with:
      | products[code=A1].price   | 100  |
      | products[code=B2].enabled | true |
#    Then json path "$.products[?(@.code=='A1')][0].price" should equal "100"
#    Then json path "$.products[?(@.code=='B2')][0].enabled" should equal "true"
    Then json path "$.products[0].price" should equal "100"
    Then json path "$.products[1].enabled" should equal "true"
