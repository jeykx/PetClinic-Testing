Feature: As a visitor to the website I can add an owner to have access to this information

  Scenario: user can add owner
    Given I'm on "find owners" page
    And I click on "Add Owner" button
    And I fill form in the following:
      |locator    |value            |
      |FIRSTNAME  |jeremy           |
      |LASTNAME   |dufour           |
      |ADDRESS    |rue du pere noel |
      |CITY       |henin beaumont   |
      |TELEPHONE  |0303030303       |
    When I click on "Add Owner" button
    Then I'm redirected on page with title "Owner Information"
    And I control that print information :
      |locator    |value            |
      |firstName  |jeremy           |
      |lastName   |dufour           |
      |address    |rue du pere noel |
      |city       |henin beaumont   |
      |telephone  |0303030303       |


    Scenario: cannot be empty: fields cannot be empty
      Given i'm on the page for creating a new owner
      When i click on the confirmation button "Add Owner" without filling in the required fields
      Then the error message "ne peut pas être vide" is displayed below each field

    Scenario Outline:
      Given i'm on "find owners" page
      And i click on the "Add Owner" button to access the form
      And I fill form in the following "<firstName>" and "<lastName>" and "<address>" and "<city>" and "<telephone>"
      When I click on the "Add Owner" button
      Then I'am redirected on page with title "Owner Information"
      Examples:
      |firstName  |lastName    |address                          |city   |telephone   |
      |julien     |leclerc     |5 rue du pont                    |lille  |0770234512  |
      |leo        |dubois      |7 avenue du pres                 |arras  |0325478952  |
      |corentin   |carpentier  |123 boulevard du marechal juin   |amiens |0678234501  |

