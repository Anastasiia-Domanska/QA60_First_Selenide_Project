Feature: Login

  Scenario: Successful login

    Given user is on the home page
    When user clicks on the login icon
    Then user verifies login form is displayed
    And user enters valid data
    And user clicks on Anmelden button
    And user click on user icon
    Then user verifies his name


  @wrongPassword
  Scenario Outline: Login with wrong password

    Given user is on the home page
    When user clicks on the login icon
    Then user verifies login form is displayed
    And user enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And user clicks on Anmelden button
    Then user verifies error message
    Examples:
      | email         | password |
      | ana@gmail.com | aa12345! |
      | ana@gmail.com | sa12345! |
      | ana@gmail.com | a12345!  |