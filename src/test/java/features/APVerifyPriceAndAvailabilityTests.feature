
  Feature: Verifying product's price and availability

    Scenario: User can check product's price and availability
      Given User is on Cart Page
      When User clicks Women tab and adds one tShirt to the cart
      Then User can see what is products's total price and if product is available



