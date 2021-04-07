package com.example.tp03;

public class Planet {
    private String nom;
    private String taille;

    public Planet(String nom, String taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public String getTaille() {
        return taille;
    }
}
