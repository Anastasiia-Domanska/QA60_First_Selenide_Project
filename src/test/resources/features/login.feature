Feature: Login

  Scenario: Successful login

    Given user is on the home page
    When user clicks on the login icon
    Then user verifies login form is displayed
    And user enters valid data
    And user clicks on Anmelden button
    And user click on user icon
    Then user verifies his name