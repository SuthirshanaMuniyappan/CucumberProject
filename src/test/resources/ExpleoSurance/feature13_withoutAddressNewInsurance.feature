@All_scenario 
@withoutAddress
Feature: TC13_New Insurance Fields - Address
  Author: Suthir

  Scenario: Validation all fields of New Insurace without Address
    Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User filled all the fields without Address
    And User click the Submit button
    Then It should show the error msg Address is Required
