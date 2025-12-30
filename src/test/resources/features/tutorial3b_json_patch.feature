Feature: Tutorial 3B - Array by index

  Scenario: Read first product price by index
    Given B3 products json with first price 100
    When B3 json path "$.products[0].price" should equal "100"
    When B3 json path "$.products[?(@.code=='B2')].price" should equal "200"