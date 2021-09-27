Feature: Verifying product's price after changing its quantity

  Scenario: User can change quantity of product in the cart and verify its total price
    Given User has one t-shirt in the cart and goes to Cart Page
    When User can change product's quantity
    Then User can verify product's total price