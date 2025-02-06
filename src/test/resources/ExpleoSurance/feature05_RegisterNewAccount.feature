@All_scenario 
#@Register
Feature: TC05_Register New User
#Author: Suthir
  @newUser
  Scenario Outline: Validating New User Registration
    Given User is on the login page
    When User Clicks the Register New Account
    And User Enters "<Email>""<Password>" and "<ConfirmPassword>"
    Then User clicks the Register button
    And User should get the Success Message

    Examples: 
      | Email           | Password | ConfirmPassword |
      | user4@gmail.com | tester@1 | tester@1        |
      | user5@gmail.com | tester@2 | tester@2        |
      | user6@gmail.com | tester@3 | tester@3        |
      | user7@gmail.com | tester@4 | tester@4        |
      | user8@gmail.com | tester@5 | tester@5        |

  @registeredUser
  Scenario Outline: Validating Registered Users
    Given User is on the login page
    When User enters the new registered "<Username>" and "<Password>"
    Then User clicks the submit button
    And User should be logged in Successfully
    Then User should be logged out Successfully
    
    Examples: 
      | Username        | Password |
      | user4@gmail.com | tester@1 |
      | user5@gmail.com | tester@2 |
      | user6@gmail.com | tester@3 |
      | user7@gmail.com | tester@4 |
      | user8@gmail.com | tester@5 |

  @registeredUserwithEmptyCrendentials
  Scenario Outline: Validating Registered Users
    Given User is on the login page
    When User enters the new registered "<Username>" and "<Password>"
    Then User clicks the submit button
    And User get the error msg

    Examples: 
      | Username         | Password |
      | loginA@gmail.com |          |
      | loginB@gmail.com |          |
      | loginC@gmail.com |          |
