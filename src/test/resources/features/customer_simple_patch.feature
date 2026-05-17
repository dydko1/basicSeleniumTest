Feature: Tutorial simple customer json patch

  Scenario: Create customer and replace basic fields
    Given base customer json is loaded from template
    When I create customer with data:
      | $.customer.firstName | $.customer.lastName | $.customer.pesel | $.customer.phone |
      | Jan                  | Kowalski            | pesel            | phone            |
    Then print final customer json