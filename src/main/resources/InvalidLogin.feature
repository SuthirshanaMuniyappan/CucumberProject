#Author: Suthir
@invalid
Feature: Login Page Functionality for invalid credentials

  @invalidLogin_Username
  Scenario Outline: UnSuccessful Login with invalid credentials
    Given The user is on the login page
    When User enters a invalid "<username>" and "<password>"
    And Clicks the login button
    Then An error msg should be displayed
    And quit the 1st Browser

    Examples: 
      | username                    | password |
      | suthirshana@expleogroup.com | Suthir   |

  @invalidLogin_Password
  Scenario Outline: UnSuccessful Login with invalid credential
    Given The user should be on the login page
    When User enters a invalid "<username>" and invalid "<password>"
    And Click the login button
    Then The error msg will be displayed
    And browser quit

    Examples: 
      | username                              | password    |
      | suthirshanamuniyappan@expleogroup.com | Suthirshana |
