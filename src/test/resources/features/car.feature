Feature: Adding car

  Scenario: Add car with valid data
    Given User launches browser
    When  User opens ilCarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Ok
    And User clicks on Let the car work link
    And User enters valid data to add car
    And User uploads Photo
    And User clicks submit button
    Then User verifies Add car message
    And User quits browser