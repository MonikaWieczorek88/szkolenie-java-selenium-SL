Feature: Removing the only one item from the cart

  Scenario: User can add one product to the cart and remove it
    Given User has one product in the cart and goes to Cart Page
    When User removes the only one product
    Then User can see information about empty cart