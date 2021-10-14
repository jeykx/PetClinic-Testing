Feature: As a visitor to the website I can add a pet so that it is visible on the owner's page

  Scenario: The website visitor can add a new pet to the owner's record
    Given i access on the owner's page
    And click "Add New Pet" button
    And i fill form in the following:
      |locator   |value       |
      |NAME      |Mosquito    |
      |BIRTHDATE |2021-12-10  |
      |TYPE      |dog         |
    When i click on "Add Pet"
    Then pet has been added to the owner's profile
    And I control that print information are "Mosquito" and "2021-12-10" and "dog":


    Scenario Outline:
      Given i am on the owner's page
      And i click on button "Add New Pet"
      And i fill form for add pet "<name>" "<birthDate>" "<type>"
      When click on "Add Pet"
      Then pets "<name>" have been added to the owner's profile

      Examples:
        |name   |birthDate  |type |
        |rex    |2020-06-13 |dog  |
        |icarus |2021-04-20 |cat  |
        |elios  |2018-02-10 |dog  |

