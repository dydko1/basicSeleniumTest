@TablesType1
Feature: User Login Functionality

  Scenario Outline: Successful and unsuccessful user login

    Given the user is on the login page
    When the user enters "<username>" as username and "<password>" as password
    And the user clicks the login button
    Then the user should see the message "<expected_message>"

    Examples:
      | username | password         | expected_message     |
      | miro     | secret_miro_pass | Login successful !!! |
#      | locked_user   | wrong_pass    | Invalid credentials   |
#      | disabled_user | other_pass    | Account is disabled   |