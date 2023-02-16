Feature: Login feature
@Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign in button
    Then verify user is successfully logged in to the account
@Smoke
  Scenario: Verify user is unable to login with invalid credentials
    Given user enters invalid username "invalid.username" and password "invalid.password"
    When user clicks on Sign in button
    Then verify user receives the error message in the login page