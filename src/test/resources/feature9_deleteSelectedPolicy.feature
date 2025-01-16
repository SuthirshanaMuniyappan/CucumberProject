#Author: Suthir

@All_scenario
#@DeleteSelectedPolicy
Feature: Delete Multiple Accounts Created in New Insurace

  Scenario: Vaildating multiple delete account created in New Insurance
    Given User should be in Login Page
    When User Select the account using AccountName for delete
    And User clicks the delete button one by one
    Then Account should be deleted
