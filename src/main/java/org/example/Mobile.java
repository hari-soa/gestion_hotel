package org.example;

import lombok.Getter;

@Getter

public class Mobile extends CategorieChambre{
    private float montant;

    public Mobile (float prix) {
        super(prix);
    }

    public void transferer(float montant, Payement destination) {
        if (montant > 0 && this.getPrix() >= montant) {
            this.retirer(montant);
            destination.verser(montant);
        }
    }

}
