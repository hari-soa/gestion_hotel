package org.example;

import lombok.Getter;

@Getter

public class Bancaire {
    private float montant;
    private float solde;
    private String recue;

    public void retirer(float montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
        }
    }

    public void transferer(float montant, Gerant destination) {
        if (montant > 0 && this.solde >= montant) {
            this.retirer(montant);
            destination.verser(montant);
        }
    }


}
