@All_Scenario
Feature: Adactin Hotel - Cancel Booking

  @cancel_Booking
  Scenario: Validation of Cancel Booking
    Given User should be in Adactin Hotel Home page
    When User clicks the Booked Itinerary
    And User select the order ID to delete 
    And select OK in alert
    Then Booking should be deleted