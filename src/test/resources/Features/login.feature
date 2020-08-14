#AuthoR
#Date
#Description

Feature: feature to test login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigated to the home page
