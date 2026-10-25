
package com.example.tp;

public class Main {

    public static void main(String[] args) {

        // 1. Creation des comptes
        Compte compte1 = new Compte(1000.0);
        CompteEpargne ce = new CompteEpargne(500.0, 3.0);
        CompteCourant cc = new CompteCourant(200.0, 300.0);

        // 2. Compte normal
        compte1.afficherDetails();
        compte1.deposer(200);
        compte1.retirer(1500);
        compte1.afficherDetails();

        System.out.println();

        // 3. Compte epargne
        ce.afficherDetails();
        ce.appliquerInterets();
        ce.afficherDetails();
        ce.retirer(100);
        ce.afficherDetails();

        System.out.println();

        // 4. Compte courant
        cc.afficherDetails();
        cc.retirer(400);
        cc.afficherDetails();
        cc.retirer(200);
        cc.afficherDetails();

        System.out.println();

        // 5. Polymorphisme
        Compte poly = new CompteEpargne(100, 5);
        poly.afficherDetails();
    }
}
