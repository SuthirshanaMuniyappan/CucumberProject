@All_scenario
#@withoutDOB
Feature: TC14_New Insurance Fields - DOB
  #Author: Suthir

  Scenario: Validation all fields of New Insurace without DOB
    Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User filled all the fields without DOB
    And User click the Submit button
    Then It should show the error msg DOB is Required