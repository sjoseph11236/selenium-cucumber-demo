Feature: login

  Scenario: check login is successful with valid credentials.

    Given broswer is open
    And user is on login page
    When user enters sayeed and 12345
    And user clicks on login
    Then user is navigated to home page