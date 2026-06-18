package org.example;

import lombok.Getter;

@Getter

public abstract class Payement {
    private float solde;

    public Payement(float soldeInitial) {
        this.solde = soldeInitial;
    }

    public String executerPayement(float montant, Gerant gerant) {
        if (montant <= 0) return "Montant invalide";
        if (this.solde < montant) return "Solde insuffisant";

        verserAuGerant(montant, gerant);

        this.solde -= montant;
        return "Payement de " + montant + "€ effectué avec succès.";
    }

    public abstract void verserAuGerant(float montant, Gerant gerant);
}