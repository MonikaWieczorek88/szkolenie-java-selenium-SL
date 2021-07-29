@AutoPracticeAddTwoItemsTesting
  Feature: Adding two items to the cart

    Scenario: Successful adding two items to the cart
      Given User goes to Home Page
      When User clicks Women tab and add tShirt and dress to the cart
      Then User can see what is in his cart



