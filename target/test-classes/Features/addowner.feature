Feature: As a visitor to the website I can add an owner to have access to this information

  Scenario: user can add owner
    Given I'm on "find owners" page
    And i click on "Add Owner" button
    And I fill form in the following:
      |locator  |value            |
      |surname  |jeremy           |
      |name     |dufour           |
      |address  |rue du pere noel |
      |city     |henin beaumont   |
      |phone    |0303030303       |
    When I click on "Add Owner" button
    Then I'm redirected on page with title "Owner Information"
    And I control that print information :
      |locator  |value            |
      |surname  |jeremy           |
      |name     |dufour           |
      |address  |rue du pere noel |
      |city     |henin beaumont   |
      |phone    |0303030303       |


