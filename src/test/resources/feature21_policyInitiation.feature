@All_scenario #@PolicyInitiation
Feature: TC21_Policy Initiation

  Scenario Outline: Validating the policy initiation page
    Given user is on the login page with valid credential
    When user click the policy initiation
    And user enter "<CustomerName>" and "<DataOfBirth>" and "<Email>" and "<PhoneNumber>" and "<Address>"
    And user select the gender
    And user clicks the existing policy
    And user select Policy type
    And user click valid and proceed button
    Then user navigate to new insurance page

    Examples: 
      | CustomerName | DataOfBirth | Email            | PhoneNumber | Address           |
      | Suthir       | 18-07-1995  | suthir@gmail.com |  1234567890 | 20,Customs colony |

  Scenario Outline: Validating New Insurance page using policy initiation page
    Given user is on the login page with valid credential
    When user clicks the New Insurance
    And user enters the "<Name>" and "<Email>" and "<Address>" and "<Birthdate>"
    And user clicks the Gender
    And user enters "<PolicyType>" and "<Coverage>" and "<SumInsured>" and "<Primium>"
    And user clicks the button
    Then user clicks the submit

    Examples: 
      | Name   | Email            | Address           | Birthdate  | PolicyType       | Coverage             | SumInsured | Primium |
      | Suthir | suthir@gmail.com | 20,Customs colony | 18-07-1995 | Health Insurance | Hospitalization cost |   2,00,000 |     543 |
