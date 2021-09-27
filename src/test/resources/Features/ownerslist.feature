Feature: Liste des propriétaires
         En tant que visiteur du site web je peux afficher la liste de tous les proprietaires afin de trouver le proprietaire que je souhaite contacter

  Scenario: Le visiteur du site accède à la liste des propriétaires par le biais du lien dédié dans la navbar du site
    Given que je suis sur la page d’accueil du site web
    When je clique sur le lien “Find Owners”
    And que je clique sur le bouton “Find Owner”
    Then j'accède à la liste de tous les propriétaires