Feature: Tutorial 3B - Filter returns list

  Scenario: Filter then assert via Java (safe)
    Given C3 products json includes code B2 with price 250
    Then C3 product with code "B2" should have price 250 using filter

  Scenario: Filter then assert via JsonPath (price[0])
    Given C3 products json includes code B2 with price 250
    Then C3 json path price for code "B2" should equal "250"