Feature: MyAccount-login Feature
  Description:

  Scenario: log-in with valid username and password
    Given  The user is on homePage
    And I click on log in
    And I enter email
    And I enter password
    And I click on login button
    Then user must successfully login to the webPage

