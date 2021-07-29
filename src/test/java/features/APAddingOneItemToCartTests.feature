
  Feature: Adding one item to the cart

    Scenario: Successful adding one item to the cart
      Given User is on Home Page
      When User clicks Women tab and adds tShirt to the cart
      Then User can see what is in the cart
