Feature: Verifying product's availabilty and price

  Scenario: User can check product's availability and price
    Given User is going to Home Page
    When User is adding one t-shirt to the cart
    Then User is going to Cart Page
    And User can see product's availabilty and price
