@TablesType1
Feature: User Login Functionality

  Scenario Outline: Successful and unsuccessful user login

    Given the user is on the login page
    When the user enters "<username>" as username and "<password>" as password
    And the user clicks the login button
    And the user gender is <gender>
    Then the user should see the message "<expected_message>"

    Examples:
      | username | password         | expected_message     | gender          |
      | miro     | secret_miro_pass | Login successful !!! | $name.female |
#      | locked_user   | wrong_pass    | Invalid credentials   |
#      | disabled_user | other_pass    | Account is disabled   |