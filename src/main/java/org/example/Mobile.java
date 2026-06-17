package org.example;

import lombok.Getter;

@Getter

public class Mobile extends CategorieChambre{
    private float montant;

    public Mobile (float prix) {
        super(prix);
    }

}
