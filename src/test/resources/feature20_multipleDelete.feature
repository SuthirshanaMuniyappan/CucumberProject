@All_scenario
@deleteMultiplePolicy
Feature: Multiple Policy Delete in Dashboard
  Author: Suthir
 
  @newUser
  Scenario Outline: Validation of multiple policy delition
    Given User should be in login Page
    And User Clicks the delete button using common name
    Then Page should be logged out