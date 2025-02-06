
@All_scenario
#@withoutSumInsured
Feature: TC16_New Insurance Fields - SumInsured
  Author: Suthir

  Scenario: Validation all fields of New Insurace without SumInsured
    Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User filled all the fields without SumInsured
    And User click the Submit button
    Then It should show the error msg Please select Sum Insured
