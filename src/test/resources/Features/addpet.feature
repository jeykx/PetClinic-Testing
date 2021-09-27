Feature: Ajouter un nouvel animal de compagnie
         En tant que visiteur du site web je peux ajouter un animal de compagnie afin qu'il soi visible sur la fiche du proprietaire

  Scenario: Le visiteur du site web peut ajouter un nouvel animal de compagnie à la fiche du propriétaire
    Given que je suis sur la fiche d’informations du propriétaire
    And que je clique sur le bouton “Add New Pet”
    And que j’ai saisi le nom de l’animal
    And que j’ai saisie la date de naissance de l’animal
    And que j’ai sélectionné le type de l’animal
    When je clique sur le bouton “Add Pet”
    Then l’animal à bien été ajouté à la fiche du propriétaire