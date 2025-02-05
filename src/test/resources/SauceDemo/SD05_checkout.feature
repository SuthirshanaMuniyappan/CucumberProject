#@AddToCart
Feature: Add to cart product

#Author: Suthir

  Scenario: Successful login with valid credentials
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    Then User should be logged in successfully
    And Add to Cart products
    Then User click the Check out button
    And User fills the information firstname and lastname and postalcode
    Then User clicks the continue button
    And User navigate to the overview page
    Then user click finish buton
    And Quit the browser
    