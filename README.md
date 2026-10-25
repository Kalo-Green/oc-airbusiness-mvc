# ✈️ Air Business - Java, Spring Boot & MVC

Projet réalisé dans le cadre du cours OpenClassrooms **« Découplez votre architecture web pour des applications Java robustes »**.

L'objectif est de refactoriser une application Java existante en séparant les responsabilités et en organisant les différentes couches pour faciliter la maintenance et l'évolution du code.

## 🎯 Présentation

Air Business est une application web de gestion liée à une compagnie aérienne.

Le projet porte sur la refactorisation de l'architecture d'une application existante pour en améliorer l'organisation.

L'application permet notamment de gérer les clients, d'identifier ceux qui présentent un solde impayé et de suivre les problèmes de maintenance des avions.

## 🏗️ Architecture

Le projet s'appuie sur l'architecture **MVC (Model-View-Controller)** :

- **Model** : représente les données métier, notamment les clients, les avions, les réservations et les problèmes de maintenance.
- **View** : affiche les données et les formulaires avec Thymeleaf.
- **Controller** : traite les requêtes HTTP et transmet aux vues les données nécessaires à leur affichage.

La couche **Repository**, basée sur Spring Data JPA, assure l'accès aux données.

## 🗄️ Base de données

L'application utilise SQLite pour stocker les données. Si le fichier `airbusiness.db` n'existe pas, il est créé automatiquement lors de la première connexion. Hibernate gère la création et la mise à jour des tables à partir des entités JPA.

## 🧱 Principes et conception

- Analyse et refactorisation d'une architecture existante
- Séparation des responsabilités avec l'architecture MVC
- Découplage et communication entre les couches de l'application

## 🛠️ Technologies et outils

- **Java 21**
- **HTML**
- **CSS**
- **Spring Boot 4.1.1**
- **Spring Web MVC**
- **Spring Data JPA**
- **Hibernate**
- **Thymeleaf**
- **SQLite**
- **Maven**
- **Git**

## 🚀 Lancer le projet

1. Cloner le dépôt GitHub.
2. Importer le projet en tant que projet Maven dans un IDE Java.
3. Exécuter la classe principale `AirbusinessMvcApplication` pour démarrer l'application.

## 📚 Compétences mises en pratique

- Développement d'une application web avec Spring Boot et Spring Web MVC
- Persistance des données avec Spring Data JPA et SQLite
- Création de vues web avec Thymeleaf
- Utilisation de requêtes dérivées et de requêtes JPQL