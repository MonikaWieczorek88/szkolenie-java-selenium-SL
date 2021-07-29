
  Feature: Changing quantity of item in the cart

    Scenario: User can change quantity of item in the cart
      Given User goes to Cart Page
      When User clicks Women tab and adds one tShirt to his cart
      Then User can change product's quantity
