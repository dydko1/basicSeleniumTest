Feature: Tutorial 3A - Simple JsonPath root field

  Scenario: Read customerId from root
    Given a simple customer json with id "CUST-123"
    Then new step json path "$.customerId" should equal "CUST-123"