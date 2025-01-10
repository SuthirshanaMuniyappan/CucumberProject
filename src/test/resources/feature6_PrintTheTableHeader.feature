#Author: Suthir

@All_scenario
#@TableHeader
Feature: Get Table Header

  @scenario_01
  Scenario Outline: Print table header in console
    #Given User is on the login page
    When User login "<username>" and "<password>"
    And Clicks the login button
    Then The User should be redirected to the dashboard page and print the Table header
    And quit the Browser

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
