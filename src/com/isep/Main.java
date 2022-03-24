package com.isep;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, quel est votre prénom ?");

        String prenom = scanner.nextLine();

        System.out.println("Bonjour " + prenom + " !");

        somme();
        division();
        volumePaveDroit();

    }

    public static void somme() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le second entier");
        int secondEntier = scanner.nextInt();
        int somme = premierEntier + secondEntier;
        System.out.println("La somme de " + premierEntier + " avec " + secondEntier + " est egale a " + somme);

    }

    public static void division() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le second entier");
        float secondEntier = scanner.nextInt();
        float division = premierEntier / secondEntier;
        System.out.println("La divion de " + premierEntier + " par " + secondEntier + " est egale a " + division);

    }

    public static void volumePaveDroit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Longueur ?");
        float longueur = scanner.nextInt();
        System.out.println("Largeur ?");
        float largeur = scanner.nextInt();
        System.out.println("Hauteur ?");
        float hauteur = scanner.nextInt();
        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume du pavé droit est " + volume);

    }

}
