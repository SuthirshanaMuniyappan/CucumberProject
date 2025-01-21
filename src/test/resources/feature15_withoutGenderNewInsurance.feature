@All_scenario
#@withoutGender
Feature: TC15_New Insurance Fields - Gender
  #Author: Suthir

  Scenario: Validation all fields of New Insurace without Gender
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Gender
    And User click the Submit button
    Then It should show the error msg Gender is Required