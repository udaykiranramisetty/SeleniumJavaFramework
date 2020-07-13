Feature: feature to test login functionality

  Scenario: Check login is succesful with valid credentials
    Given user opens login page
    When user enters username and password
    And clicks login button
    Then user is navigated to Home page
