@All_scenario 
#@DeleteSelectedPolicy
Feature: TC09_Delete Multiple Accounts Created in New Insurace

  #Author: Suthir
  Scenario: Vaildating multiple delete account created in New Insurance
    Given User should be in login Page with valid credentials
    When User Select the account using AccountName for delete
    And User clicks the delete button one by one
    Then Account should be deleted