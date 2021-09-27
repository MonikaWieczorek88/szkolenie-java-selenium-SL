Feature: Adding two products to the cart

  Scenario: Adding two products to the cart
    Given User is on main page - Home Page
    When User adds one t-shirt and one dress to the cart
    Then Products are in the cart