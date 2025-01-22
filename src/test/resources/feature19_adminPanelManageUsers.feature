
@All_scenario
@adminPanelManageUsers
Feature: TC19_Admin Panel

#Author:Suthir

  Scenario Outline: Admin Panel Manager Users Delete
    Given User should be in login Page with valid credentials
    When user clicks the Admin panel
    And user clicks manage users to View Users
    Then user delete the button
    And Quit the browser
