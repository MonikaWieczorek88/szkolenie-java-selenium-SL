Feature: Logging into the store

    Scenario Outline: User signs in using correct credentials
      Given User is on Login Page
      When User enters correct credentials <email> and <password> and clicks on Sign in button
      Then User is logged in correctly and user can see user info

      Examples:
        | email                      | password |
        | monika.tester.88@gmail.com |test123   |



