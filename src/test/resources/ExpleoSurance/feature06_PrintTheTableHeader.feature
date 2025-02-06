@All_scenario
Feature: TC06_Get Table Header

  @scenario_01
  Scenario Outline: Print table header in console
    Given User should be in login Page with valid credentials
    Then The User should be redirected to the dashboard page and print the Table header

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
