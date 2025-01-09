#Author: Suthir

@All_scenario
#@deletePolicy
Feature: Delete Policy

  @delete_cancel
  Scenario Outline: Validating Delete Policy for Cancel button
    Given User opens the login page
    When User should enters "<username>" and "<password>"
    And User clicks the Submit button
    Then User clicks delete Policy
    Then User clicks Cancel button
    Then quit the Browser for "Cancel" scenario

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |

  @delete_yes
  Scenario Outline: Validating Delete Policy and Yes button
    Given User opens the login page
    When User should enters "<username>" and "<password>"
    And User clicks the Submit button
    Then User clicks delete Policy
    Then User clicks Yes button
    Then quit the Browser for "Yes" scenario

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
