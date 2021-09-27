Feature : En tant que utilisateur d'internet je peux avoir accés au site web via un navigateur afin de profiter de ces differents services

  Scenario: Le visiteur accède au site web https://spring-petclinic-community.herokuapp.com/ via un navigateur.
    Given que je suis bien connecté à internet
    When je saisi l’URL : https://spring-petclinic-community.herokuapp.com/ dans le navigateur web
    And que je clique sur l’url du site web
    Then je suis redirigé vers la page d’accueil du site web