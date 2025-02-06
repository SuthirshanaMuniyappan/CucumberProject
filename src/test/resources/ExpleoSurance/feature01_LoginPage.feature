@All_scenario
Feature: TC01_Login Page Functionality

  #Author:Suthir
  @scenario_01
  Scenario Outline: Successful Login with valid credentials
    Given The user is on the login page
    When User should login "<username>" and "<password>"
    And Clicks the Submit button
    Then The User should be redirected to the dashboard page

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |

  Scenario Outline: Validation of invalid credentials
    Given The user is on the login page
    When User should login "<username>" and "<password>"
    And User Click the login button
    Then Error message will be displayed

    Examples: 
      | username                               | password    |
      | suthirshana.muniyappan@expleogroup.com | Suthirshana |
      | suthirshana.muniyappan@expleo.com      | Suthir      |
      | suthirshana.muniyappan@expleo.com      | Suthirshana |

  Scenario Outline: Validation of Empty credentials
    Given The user is on the login page
    When User should login "<username>" and "<password>"
    When User Clicks the login button
    Then Error message will be displayed as Username and password are required

    Examples: 
      | username                               | password |
      |                                        | Suthir   |
      | suthirshana.muniyappan@expleogroup.com |          |
      |                                        |          |
