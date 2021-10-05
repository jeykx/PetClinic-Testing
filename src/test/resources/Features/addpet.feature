Feature: As a visitor to the website I can add a pet so that it is visible on the owner's page

  Scenario: The website visitor can add a new pet to the owner's record
    Given que je suis sur la fiche d’informations du propriétaire
    And que je clique sur le bouton “Add New Pet”
    And i fill form in the following:
      |locator   |value
      |name      |Mosquito
      |birthDate | 2014-12-05
      |type      |dog
    When i click on "Add Pet"
    Then pet has been added to the owner's profile
    And I control that print information are:
      |locator   |value
      |name      |Mosquito
      |birthDate | 2014-12-05
      |type      |dog
