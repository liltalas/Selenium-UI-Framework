Feature: Transfer Funds from one account to another

  # UI -automation testing
  Scenario: Verify user is able to transfer funds Between Accounts
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign in button

    Then verify user is successfully logged in to the account
    When user clicks on Transfer Between Accounts menu

    Then verify user is on the Internal Transfer page
    When user selects from account "transfer.from.account"
    And user selects to account "transfer.to.account"
    And user enters amount "transfer.amount"
    And user clicks on Submit button

    Then verify user is on View Accounts Page
    And verify transaction history for the new transaction

    #have to verify data from the database
    And verify transaction details getting updated into the database