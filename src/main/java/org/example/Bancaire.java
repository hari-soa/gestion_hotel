package org.example;

import lombok.Getter;

@Getter

public class Bancaire extends CategorieChambre{
    private float montant;

    public Bancaire(float prix) {
        super(prix);
    }

    public void verser(float argent) {
        if (argent > 0) {
            this.montant += argent;
        }
    }
}
