package org.example;

import lombok.Getter;

@Getter

public class Bancaire extends CategorieChambre {
    private float solde;

    public Bancaire(float prix, float soldeInitial) {
        super(prix);
        this.solde = soldeInitial;
    }

    public String payerChambre(Gerant destination) {
        float montantAPayer = this.getPrix();

        if (this.solde >= montantAPayer) {
            this.solde -= montantAPayer;

            destination.verser(montantAPayer);

            return "Reçu : Paiement de " + montantAPayer + "Ar effectué avec succès.";
        } else {
            return "Erreur : Solde insuffisant.";
        }
    }
}
