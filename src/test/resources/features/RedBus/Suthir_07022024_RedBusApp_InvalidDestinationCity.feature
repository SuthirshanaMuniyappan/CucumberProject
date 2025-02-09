@All_scenario @RedBus
Feature: Suthir_07022024_RedBus_InvalidDestinationCity_feature

  #@InvalidDestinationCity
  Scenario: Verify the error message by without selecting To field
    Given I am on the RedBus homepage
    When I enter "Chennai" in the source city field
    When I enter "" in the destination city field
    And I select "10" as the date
    And I click on "Search Buses"
    Then Validate the mandatory error message for To field
