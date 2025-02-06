@All_scenario
Feature: TC07_Validation of Deleting Users in ExpleoSurance Page
#Author: Suthir
  @deleteAccount
  Scenario Outline: Deleting Registered Users
		Given User should be in login Page with valid credentials
    When User clicks the delete button for the selected Users
    Then User should be deleted in the Dashboard

    Examples: 
      | Username         | Password |
      | loginA@gmail.com | tester@1 |