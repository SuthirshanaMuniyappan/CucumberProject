#Author: your.email@your.domain.com
Feature: Login Page Functionality

  @validateLandingPageTitle
  Scenario Outline: Validate the landing page title
    Given The user is on the login page
    When User should login "<username>" and "<password>"
    And Clicks the login button
    Then Validate the dashboard page title
    And quit the Browser

    Examples: 
      | username                               | password |
      | suthirshana.muniyappan@expleogroup.com | Suthir   |
