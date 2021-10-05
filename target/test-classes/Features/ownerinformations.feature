Feature: As a visitor to the website I can search for an owner by name to get access to this information

  Scenario: The website visitor can access the information sheet of an owner
    Given i am on the home page of the website url
    And i click on the "Find owners" link in the navbar
    When i fill form
    |locator |value       |
    |name    |dufour      |
    And click on the "Find Owner" button
    Then the owner's details are displayed

  Scenario Outline: The website visitor can access the information sheet of an owner
    Given i am good on the home page of the website
    And click on the "Find owners" link in the navbar
    When i fill form "<name>"
    And i click on the "Find Owner" button
    Then the owner's details are good displayed

    Examples:
    |name     |
    |Dubois   |
    |Dupont   |
    |Franklin |
    |Black    |
