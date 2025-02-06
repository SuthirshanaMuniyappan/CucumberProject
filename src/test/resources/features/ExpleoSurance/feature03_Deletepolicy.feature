@All_scenario
#@deletePolicy
Feature: TC03_Delete Policy
#Author: Suthir

  @delete_cancel
  Scenario Outline: Validating Delete Policy for Cancel button
    Given User should be in login Page with valid credentials
    Then User clicks delete Policy
    Then User clicks Cancel button

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |

  @delete_yes
  Scenario Outline: Validating Delete Policy and Yes button
    Given User should be in login Page with valid credentials
    Then User clicks delete Policy
    Then User clicks Yes button

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
