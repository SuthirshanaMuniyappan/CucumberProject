#@Logout
Feature: Logout Sauce Demo

#Author: Suthir

  Scenario: Successful login with valid credentials
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    Then User should be logged in successfully
    And User clicks the Open Menu
    Then User click the logout
    And Quit the browser