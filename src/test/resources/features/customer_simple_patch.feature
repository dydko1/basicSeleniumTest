Feature: Tutorial simple customer json patch

  Scenario: Create customer and replace basic fields v1
    Given base customer json is loaded from template
    When I create customer with data:
      | $.customer.firstName | $.customer.lastName | $.customer.pesel | $.customer.phone |
      | Jan                  | Kowalski            | pesel            | phone            |
    Then print final customer json

  Scenario: Create customer and replace basic fields v2
    When I create customer json from map:
      | $.firstName | $.lastName | $.pesel | $.phone | $.test1 | $.test.test1 | $.test.test2 |
      | Jan         | Kowalski   | pesel   | phone   | test111 | eee          | dsfs         |
    Then print final customer json v2