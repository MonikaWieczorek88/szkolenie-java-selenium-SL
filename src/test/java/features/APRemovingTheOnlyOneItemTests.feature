Feature: Removing the only one item from the cart

  Scenario: Adding one product to the cart and removing it
    Given User is going to Home Page
    When User clicks Women tab and add tShirt to his cart
    Then User can remove the only one product from the cart
