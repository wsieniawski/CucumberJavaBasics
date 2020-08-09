Feature: Test login funcitionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Wojciech |    12345 |
      | Someone  |    12345 |