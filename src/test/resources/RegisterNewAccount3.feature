#Author: Suthirshana

@All_scenario
#@Register
Feature: Register New User

  @newUser
  Scenario Outline: Validating New User Registration
    Given User enters into the login page
    When User Clicks the Register New Account
    And User Enters "<Email>""<Password>" and "<ConfirmPassword>"
    Then User clicks the Register button
    And User should get the Success Message
   Then quit the 1st Browser for registerUser

    Examples: 
      | Email            | Password | ConfirmPassword |
      | login993@gmail.com | tester@1 | tester@1        |
      | login994@gmail.com | tester@2 | tester@2        |
      | login995@gmail.com | tester@3 | tester@2        |

  @registeredUser
  Scenario Outline: Validating Registered Users
    Given User enters into the login page
    When User enters the new registered "<Username>" and "<Password>"
    Then User clicks the submit button
    And User should be logged in Successfully
    Then User should be logged out Successfully
    Then quit the 2nd Browser for registerUser

    Examples: 
      | Username         | Password |
      | login993@gmail.com | tester@1 |
      | login994@gmail.com | tester@2 |
      | login995@gmail.com | tester@3 |