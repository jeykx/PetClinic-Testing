Feature: En tant que visiteur du site web je peux avoir acces à la liste des vétérinaires afin de pouvoir consulter les informations de ceux-ci

  Scenario: Le visiteur accède à la liste des vétérinaires par le biais du lien dédié dans la navbar du site
    Given que je suis sur la page d'accueil du site web
    When je clique sur le lien VETENARIANS
    Then je suis redirigé vers la liste des vétérinaires
