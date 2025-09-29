@TablesType2
Feature: Valid Registration Form

  Scenario: Valid Registration Form Information (1D)
    Given User submits a valid registration form 1
      | John  |
      | Doe   |
      | Miro  |
      | Dydko |
    Then System proceeds with registration

  Scenario: Valid Registration Form Information 2 (11D)
    Given User submits a valid registration form 2
      | John 2  |
      | Doe   2 |
      | Miro  2 |
      | Dydko 2 |
    Then System proceeds with registration

  Scenario: Valid Registration Form Information with Header (2D)
    Given User submits a valid registration form header 11
      | FirstName | LastName | Username | Password  | Email              |
      | John      | Doe      | jdoe     | testPass1 | jdoe@email.com     |
      | Anne      | Smith    | asmith   | testPass2 | asmith@email.com   |
      | Mike      | Stewart  | mstewart | testPass3 | mstewart@email.com |
    Then System proceeds with registration

  Scenario: Valid Registration Form Information with Header (22D)
    Given User submits a valid registration form header 2
      | FirstName  | LastName   | Username  | Password    | Email           |
      | John     2 | Doe      2 | jdoe    2 | testPass1 2 | jdoe@email.com  |
      | MiroXX   2 | DydkoXX 2  | lechu   2 | pasełko  2  | miro2@email.com |
    Then System proceeds with registration

  # transofmer uzywa glue
  Scenario: Valid Registration Form Information with Header (222D)
    Given User submits a valid registration form header 3
      | name   | lastName  |
      | John 3 | Doe 3     |
      | Anne 3 | Smith 3   |
      | Mike 3 | Stewart 3 |
    Then System proceeds with registration