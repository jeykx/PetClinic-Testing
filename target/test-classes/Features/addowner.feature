Feature: En tant que visiteur du site web je peux ajouter un proprietaire afin d'avoir accés à ces informations

  Scenario: Le visiteur du site web peut ajouter un propriétaire
    Given que le bouton est visible
    And que je clique sur le bouton "Add Owner"
    And que j’ai saisi mon prénom
    And que j’ai saisi mon nom
    And que j’ai saisie mon adresse
    And que j'ai saisie ma ville
    And que j’ai saisi mon numéro de téléphone
    When je clique sur le bouton “Add Owner”
    Then la fiche du propriétaire ai bien créé

