Feature: User create account and sign in
@regression

  Scenario: Create an account and sign in
  
    Given the user is on the Create account page
    When the user fills and submit sign up form with valid details
    Then the user should see a success message confirming account creation
    And the user clicks and redirected to the sign-in page
    When the user fills in the sign-in form with the created account details
    And the user submits the sign-in form
    Then the user should be successfully signed in
    And the user should see a welcome message