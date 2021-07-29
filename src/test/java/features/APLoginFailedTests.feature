@AutoPracticeLoggingTesting
Feature: Logging into the store

    Scenario Outline: User signs in using wrong credentials
      Given User is on Login Page
      When User enters wrong credentials <email> and / or <password> and click on Sign in button
      Then User can see error message

      Examples:
        | email                      | password |
        | randomemail@gmail.com      | 111      |
        |                            | 222      |
        | monika.tester.88@gmail.com |          |
        | wrongemail.gmail.com       | 333      |

