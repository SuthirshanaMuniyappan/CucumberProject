@All_scenario 
#@DeleteRegisterUser
Feature: TC10_Delete Multiple Registered Accounts Created in New Insurace

  #Author: Suthir
  Scenario Outline: Validation of Adding New Insurance
    Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User enters the "<Name>", "<Email>", "<Address>", "<Date>"
    And User Select the "<Gender>" and "<PolicyType>" and "<Coverage>"
    And User select the "<SumInsured>" and "<Premium>"
    And User clicks the Yes or No button
    And User click the Submit button
    Then Page should show Insurance policy created successfully
    And Quit the NewInsurance Browser

    Examples: 
      | Name   | Email                      | Address | Date       | Gender | PolicyType        | Coverage              | SumInsured | Premium |
      | Suthir | expleo@expleo.com          | Expleo  | 31-01-2025 | Female | Health Insurance  | Hospitalization Costs |     300000 |    5000 |
      | Suthir | expleoinsurance@expleo.com | Expleo  | 02-02-2025 | Female | Health Insurance  | Treatement Costs      |     300000 |    5000 |
      | Suthir | suthir@expleo.com          | Expleo  | 03-02-2025 | Female | Health Insurance  | Emergency Costs       |     300000 |    5000 |
      | Suthir | suthirshana@expleo.com     | Expleo  | 04-02-2025 | Female | Life Insurance    | Term                  |     300000 |    5000 |
      | Suthir | shana@expleo.com           | Expleo  | 05-02-2025 | Female | Life Insurance    | Endovement            |     300000 |    5000 |
      | Suthir | sugi@expleo.com            | Expleo  | 06-02-2025 | Female | Life Insurance    | Retirement            |     300000 |    5000 |
      | Suthir | suji@expleo.com            | Expleo  | 07-02-2025 | Female | Vehicle Insurance | Third-Party-Liability |     300000 |    5000 |
