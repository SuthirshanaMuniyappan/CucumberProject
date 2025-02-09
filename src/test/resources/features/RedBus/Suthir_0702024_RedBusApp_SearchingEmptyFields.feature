@All_scenario @RedBus
Feature: Suthir_07022024_RedBus_Searching_EmptyField_feature

  #@SearchingEmptyFields
  Scenario: Verify the error message by searching empty fields
    Given I am on the RedBus homepage
    When I enter "" in the source city field
    When I enter "" in the destination city field
    And I select "10" as the date
    And I click on "Search Buses"
    Then Validate the mandatory error message for empty field
