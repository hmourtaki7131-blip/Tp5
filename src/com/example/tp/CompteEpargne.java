
package com.example.tp;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        double interets = solde * tauxInteret / 100.0;
        solde += interets;

        System.out.println("CompteEpargne #" + getNumero()
                + " : intérêts de " + interets);
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteEpargne #" + getNumero()
                + " — solde = " + solde
                + ", taux = " + tauxInteret + "%");
    }
}

