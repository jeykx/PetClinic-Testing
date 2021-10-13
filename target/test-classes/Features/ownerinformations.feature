Feature: As a visitor to the website I can search for an owner by name to get access to this information

  Scenario: The website visitor can access the information sheet of an owner
    Given i am on the home page of the website url
    And i click on the "find owners" link in the navbar
    When i fill form
    |locator |value       |
    |LASTNAME|Franklin    |
    And click on the Find Owner button
    Then the owner's details are displayed

  Scenario Outline: The website visitor can access the information sheet an owner
    Given i am good on the home page of the website
    And click on the "find owners" link in the navbar
    When i fill form "<LASTNAME>"
    And i click on the Find Owner button
    Then the details of the owners named "<LASTNAME>" are well displayed

    Examples:
    |LASTNAME   |
    |Coleman    |
    |Escobito   |
    |Franklin   |
    |Black      |
