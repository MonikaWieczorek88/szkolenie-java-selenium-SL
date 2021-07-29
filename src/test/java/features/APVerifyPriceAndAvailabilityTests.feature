@AutoPracticeVerifyPriceAndProductAvailabilityTesting.feature
  Feature: Verifying product's price and availability

    Scenario: Checking product's price and availability
      Given User is on Cart Page
      When User clicks Women tab and add one tShirt to the cart
      Then User can see what is products's total price and if product is available



