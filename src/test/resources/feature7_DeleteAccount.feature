#Author: Suthir
@All_scenario
Feature: Validation of Deleting Users in ExpleoSurance Page

  @deleteAccount
  Scenario Outline: Deleting Registered Users
    Given User enter the ExpleosuraceHome page
    When User clicks the delete button for the selected Users
    Then User should be deleted in the Dashboard
    And Quit the Browser

    Examples: 
      | Username         | Password |
      | loginA@gmail.com | tester@1 |
      | loginB@gmail.com | tester@2 |
      | loginC@gmail.com | tester@3 |
