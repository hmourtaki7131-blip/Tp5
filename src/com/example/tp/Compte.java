
package com.example.tp;

public class Compte {
    private static int compteur = 0;
    private final int numero;
    protected double solde;

    public Compte(double soldeInitial) {
        this.numero = ++compteur;
        this.solde = soldeInitial;
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Compte #" + numero
                    + " : dépôt de " + montant);
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Compte #" + numero
                    + " : retrait de " + montant);
        } else {
            System.out.println("Compte #" + numero
                    + " : retrait impossible (solde insuffisant)");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte #" + numero
                + " — solde = " + solde);
    }
}
