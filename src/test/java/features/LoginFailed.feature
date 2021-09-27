Feature: Failed logging into the store

    Scenario Outline: User signs in using wrong credentials
      Given User is on Logging Page
      When User enters wrong credentials <email> and / or <password> and clicks on Sign in button
      Then User is not logged in and user can see error message

      Examples:
        | email                      | password |
        | randomemail@gmail.com      | 111      |
        |                            | 222      |
        | monika.tester.88@gmail.com |          |
        | wrongemail.gmai.com        | 333      |

