
Feature: Changing quantity of product in the cart

  Scenario: Changing quantity of product in the cart
    Given User goes to Cart Page
    When User clicks Women tab and adds one tShirt to his cart
    Then User can change product's quantity
