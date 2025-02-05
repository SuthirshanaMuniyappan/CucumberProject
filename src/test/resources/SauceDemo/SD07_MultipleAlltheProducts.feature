#@Alltheproducts
Feature: Add all the Products 

#Author: Suthir

  Scenario: Successful login with valid credentials
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    And User should be logged in successfully
    #And Add to Cart products
    And user add all the product to the cart
    And User click the Check out button
    And User fills the information firstname and lastname and postalcode
    And User clicks the continue button
    And User navigate to the overview page
    And user click finish buton
    Then Quit the browser