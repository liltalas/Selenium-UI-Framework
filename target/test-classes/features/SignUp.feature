Feature: Sign up functionality

  Scenario: Verify user is able to sign up with valid credentials
    Given user is on the login page
    When user clicks on Sign Up Here button
    Then verify user is on the info filling form page
    Given user enters valid credentials to fill out the form
    When user clicks on Next button
    Then verify user is in the second part of the info filling page
    Given user fills out the form
    When user clicks on Register button
    Then verify user is successfully signed up to the Digital Bank