Feature: En tant que visiteur du site web je peux rechercher un propriétaire par son nom afin d'avoir accés à ces informations

  Scenario: Le visiteur du site web accède à la fiche d’information d’un propriétaire
    Given que je suis sur la page Find Owners
    When je saisi le nom du propriétaire dans le champ
    And que je clique sur le bouton “Find Owner”
    Then les informations du propriètaire s'affiche