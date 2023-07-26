Feature: Login with valid Credentials

  Scenario: Login with valid Credentials
    Given Open Chrome Browser
    And Open URL "https://www.demo.guru99.com/v4"
    When Login ID Login Password
    And Click on Submit
    Then Redirect to Bankpage
