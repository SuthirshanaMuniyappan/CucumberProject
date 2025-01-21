@All_scenario
#@LoginPage
Feature: TC1_Login Page Functionality
#Author:Suthir

  @scenario_01
  Scenario Outline: Successful Login with valid credentials
    Given The user is on the login page
    When User should login "<username>" and "<password>" 
    And Clicks the Submit button 
    Then The User should be redirected to the dashboard page
    And quit the 1st Browser

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |

  @scenario_02
  Scenario Outline: Unsuccessful Login with invalid credentials
    Given The user is on the login page
    When User enters an invalid "<username>" and "<password>"
    And Clicks the Submit button
    Then An error message should be displayed
    And quit the 2nd Browser

    Examples: 
      | username                    | password |
      | suthirshana@expleogroup.com | Suthir   |

  @scenario_03
  Scenario Outline: Login with empty credentials
    Given The user is on the login page
    When The User leaves the "<username>" and "<password>" fields empty
    And Clicks the Submit button
    Then A valid message should be displayed
    Then quit the 3rd Browser

    Examples: 
      | username | password |
      |          |          |

  @scenario_04
  Scenario Outline: Unsuccessful Login with invalid credentials
    Given The user is on the login page
    When User enters an invalid "<username>" and "<password>"
    And Clicks the Submit button
    Then An error message should be displayed
    And quit the 4th Browser

    Examples: 
      | username                              | password    |
      | suthirshanamuniyappan@expleogroup.com | Suthirshana |

  @scenario_05
  Scenario Outline: Validate the landing page title
    Given The user is on the login page
    When User should login "<username>" and "<password>"
    And Clicks the Submit button
    Then Validate the dashboard page title
    And quit the 5th Browser

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
