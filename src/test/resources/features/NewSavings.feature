Feature: Set Up Savings Account
  Scenario: Verify user creates a new savings account
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign in button
    Then verify user is successfully logged in to the account
    When user clicks savings menu and selects new savings
    Then verify user open up the new savings page
    Given user selects savings account type, ownership, name, and initial deposit
    When user clicks on submit button
    Then verify user has created the account and has the correct data
