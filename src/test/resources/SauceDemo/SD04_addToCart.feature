#@AddToCart
Feature: Add to cart product

#Author: Suthir

  Scenario: Successful login with valid credentials
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    Then User should be logged in successfully
    And Add to Cart products
    And Quit the browser