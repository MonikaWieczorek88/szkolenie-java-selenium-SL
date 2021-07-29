
  Feature: Verifying product's price after changing its quantity

    Scenario: User can change quantity of product in the cart and verify its total price
      Given User is going to Cart Page
      When User clicks Women tab and adds one tShirt
      Then User can change product's quantity and verify its total price



