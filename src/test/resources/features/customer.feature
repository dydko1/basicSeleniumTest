Feature: Customer create with JSON patch

  Scenario: Patch JSON from DataTable
    Given base customer request body
    And patch request body with:
      | customer.firstName      | Jan                 |
      | customer.lastName       | Kowalski            |
      | customerId              | $context.customerId |
      | communicationData.email | $random.email       |
    Then patched JSON should have "Jan" at "$.customer.firstName"
