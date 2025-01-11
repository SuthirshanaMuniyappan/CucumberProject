#Author:Suthir
@All_scenario
Feature: Validation of New Insurace Details

  @NewInsurance
  Scenario Outline: Validation of Adding New Insurance
    Given User should be in login Page with valid credentials
    And User Clicks the New Insurance Tab
    And User enters the "<Name>", "<Email>", "<Address>", "<Date>"
    And User Select the "<Gender>" and "<PolicyType>" and "<Coverage>"
    And User select the "<SumInsured>" and "<Premium>"
    And User clicks the Yes or No button
    And User click the Submit button
    Then Page should show Insurance policy created successfully
    And Quit the Browser

    Examples: 
      | Name            | Email                      | Address | Date       | Gender | PolicyType        | Coverage                | SumInsured | Premium |
      | Expleo          | expleo@expleo.com          | Expleo  | 31-01-2025 | Female | Health Insurance  | Hospitalization Costs   |     300000 |    5000 |
      | ExpleoInsurance | expleoinsurance@expleo.com | Expleo  | 02-02-2025 | Female | Health Insurance  | Treatement Costs        |     300000 |    5000 |
      | Suthir          | suthir@expleo.com          | Expleo  | 03-02-2025 | Female | Health Insurance  | Emergency Costs         |     300000 |    5000 |
      | Suthirshana     | suthirshana@expleo.com     | Expleo  | 04-02-2025 | Female | Life Insurance    | Term                    |     300000 |    5000 |
      | Shana           | shana@expleo.com           | Expleo  | 05-02-2025 | Female | Life Insurance    | Endovement              |     300000 |    5000 |
      | Sugi            | sugi@expleo.com            | Expleo  | 06-02-2025 | Female | Life Insurance    | Retirement              |     300000 |    5000 |
      | Suji            | suji@expleo.com            | Expleo  | 07-02-2025 | Female | Vehicle Insurance | Third-Party-Liability   |     300000 |    5000 |
      | Sujitha         | sujitha@expleo.com         | Expleo  | 08-02-2025 | Female | Vehicle Insurance | Comprehensive           |     300000 |    5000 |
      | Shan            | shan@expleo.com            | Expleo  | 09-02-2025 | Female | Vehicle Insurance | Personal Vehicle Damage |     300000 |    5000 |
      | Sri             | sri@expleo.com             | Expleo  | 10-02-2025 | Female | Health Insurance  | Laborotary Costs        |     300000 |    5000 |
      | Sumo            | sumo@expleo.com            | Expleo  | 11-02-2025 | Female | Health Insurance  | Hospitalization Costs   |     300000 |    5000 |
      | Sugu            | sugu@expleo.com            | Expleo  | 11-02-2025 | Female | Health Insurance  | Hospitalization Costs   |     300000 |    5000 |
      | Sumu            | sumu@expleo.com            | Expleo  | 11-02-2025 | Female | Health Insurance  | Hospitalization Costs   |     300000 |    5000 |
      