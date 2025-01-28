Feature: Filter validation

  Scenario: Validation of filers
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    And User should be logged in successfully
    And User select the filter option (A to Z) and take screenshot
    And User select the filter option (Z to A) and take screenshot
    And User select the filter option price (low to high) and take screenshot
    And User select the filter option price (high to low) and take screenshot
    Then page logout
