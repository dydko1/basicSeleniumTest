Feature: Zarządzanie kontem bankowym

  Scenario: Użytkownik widzi prawidłowe saldo po rejestracji
    Given Nowy użytkownik został zarejestrowany z domyślnym saldem "$1000"
    When Użytkownik loguje się do systemu
    Then Powinien zobaczyć saldo konta "$1000"