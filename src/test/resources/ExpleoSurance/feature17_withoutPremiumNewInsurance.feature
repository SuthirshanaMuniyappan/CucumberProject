@All_scenario
#@withoutPremium
Feature: TC17_New Insurance Fields - Premium
  Author: Suthir

  Scenario: Validation all fields of New Insurace without Premium
   Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User filled all the fields without Premium
    And User click the Submit button
    Then It should show the error msg Please select Premium