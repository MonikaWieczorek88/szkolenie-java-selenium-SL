
Feature: Verify product's price after changing quantity

  Scenario: Changing quantity of product in the cart and verifying its total price
    Given User is going to Cart Page
    When User clicks Women tab and adds one tShirt
    Then User can change product's quantity and verify its total price



