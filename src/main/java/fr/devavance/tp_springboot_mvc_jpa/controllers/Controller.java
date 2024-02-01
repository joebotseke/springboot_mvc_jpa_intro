package fr.devavance.tp_springboot_mvc_jpa.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String getTemplate1(Model model){
        model.addAttribute("name", "Capteur température");
        return "template1";
    }
}

Travail pratique 1 : Spring Boot, MVC,JPA

Exercice 1 : Premier projet en utilisant le framework Spring Boot


Question 1 : Initialisation du projet Spring Boot 

Réponse 1 :
Je me suis rendu sur Spring Initializr, j'ai ajouter les dépendances de mon projet, j'ai défini le nom du projet, du package et sa desciption puis cliquer generate pour initialiser une nouveau projet Spring Boot.Cela s'est fait en quelques cliques et facilement.

Question 2: Commençons avec les bases de Spring Web MVC

Réponse 2 : 
J'ai fait un glisser-déposer du projet dans Intellij; pour lancer les goals clean et install de Maven, j'ai configuré d'abord le SDK en choissant le 17.

En faisant localhost:8080, j'ai juste la page Whitelabel Error Page qui apparait, c'est bon signe déjà.

http://localhost:8080/plain.html est visible 

http://localhost:8080/template1.html n'est pas visible, c'est le même message d'erreur que localhost:8080.


Question 3 : Mécanisme des templates

1 - 
package fr.devavance.tp_springboot_mvc_jpa.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String getTemplate1(){

        return "template1";
    }
}

C'est à partir du Controller ensuite que lorsque je fais http://localhost:8080/, c'est le template1 qui est affiché 

Questions :

    A quoi correspond la chaîne renvoyé par la méthode getTemplate1() ? : ça permet de spécifier le nom du fichier à afficher
    Est-il absolument nécessaire que la méthode s’appelle getTemplate1() ? : non, je l'ai appelé getPageAccueil et ça a marché
    Quel rôle joue la page template1.html ?, ça joue le rôle de la vue 
    
    
Question 4 : Transfert de données (un modèle) du contrôleur à la vue.

1- <!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>

2 - <h2 th:text = ${name}></h2>

Lorsqueje relance, j'ai bien Capteur température qui s'affiche comme texte de cet élément 

Exercice 2 : Bonne pratique, utilisez git ! (Rappel) 

    
key_23@einfolearning:~/Téléchargements/tp_springboot_mvc_jpa$ git status
Sur la branche master
rien à valider, la copie de travail est propre
key_23@einfolearning:~/Téléchargements/tp_springboot_mvc_jpa$ 
