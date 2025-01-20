@All_scenario
#@withoutDOB
Feature: New Insurance Fields - DOB
  #Author: Suthir

  Scenario: Validation all fields of New Insurace without DOB
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without DOB
    And User click the Submit button
    Then It should show the error msg DOB is Required