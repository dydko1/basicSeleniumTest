Feature: Tutorial 33A - Simple JsonPath root field

  Scenario: A33 Read customerId from root
    Given A33 a simple customer json with id "myId321aa"
    When A33 json path "customerId" should equal "myId321aa"