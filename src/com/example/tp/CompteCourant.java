
package com.example.tp;

public class CompteCourant extends Compte {

    private double decouvertAutorise;

    public CompteCourant(double soldeInitial,
                         double decouvertAutorise) {
        super(soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0
                && solde + decouvertAutorise >= montant) {
            solde -= montant;

            System.out.println("CompteCourant #" + getNumero()
                    + " : retrait de " + montant);
        } else {
            System.out.println("CompteCourant #" + getNumero()
                    + " : retrait impossible (découvert max dépassé)");
        }
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteCourant #" + getNumero()
                + " — solde = " + solde
                + ", découvert autorisé = " + decouvertAutorise);
    }
}

