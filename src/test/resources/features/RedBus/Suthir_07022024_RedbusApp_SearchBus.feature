@All_scenario 
@RedBus #@Searchbus
Feature: Suthir_07022024_RedBus_SearchOption feature

@Searchbus01
  Scenario: Search for a bus from Chennai to Palani
    Given I am on the RedBus homepage
    When I enter "Chennai" in the source city field
    And I enter "Palani" in the destination city field
    And I select "10" as the date
    And I click on "Search Buses"
    Then I should see a list of buses from Chennai to Palani
    And Validate the page title should contain "Chennai to Palani"
    
@Searchbus02
  Scenario: Search for a bus from Chennai to Palani
    Given I am on the RedBus homepage
    When I enter "Chennai" in the source city field
    And I enter "Chennai Intl Airport" in the destination city field
    And I select "10" as the date
    And I click on "Search Buses"
    Then Validate the error message "Oops! No buses found."
