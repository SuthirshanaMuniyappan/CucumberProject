
@All_scenario
#@withoutSumInsured
Feature: TC16_New Insurance Fields - SumInsured
  Author: Suthir

  Scenario: Validation all fields of New Insurace without SumInsured
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without SumInsured
    And User click the Submit button
    Then It should show the error msg Please select Sum Insured
