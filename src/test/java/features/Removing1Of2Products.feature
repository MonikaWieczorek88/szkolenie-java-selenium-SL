Feature: Removing one of two items from the cart

  Scenario: User can add two products to the cart and remove one of them
    Given User has two items in the cart and goes to Cart Page
    When User removes one of two products
    Then User has one product in the cart

