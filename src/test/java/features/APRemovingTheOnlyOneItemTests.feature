
  Feature: Removing the only one item from the cart

    Scenario: User can add one product to the cart and remove it
      Given User is going to Home Page
      When User clicks Women tab and adds tShirt to his cart
      Then User can remove the only one product from the cart
