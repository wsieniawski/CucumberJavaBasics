Feature: Feature to test google search funcionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters the text in search box
    And hits enter
    Then user is navigated to search results
