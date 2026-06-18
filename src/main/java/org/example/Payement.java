package org.example;

import lombok.Getter;

@Getter

public class Payement extends CategorieChambre {
    private TypePayement typePayement;


    public Payement(float prix) {
        super(prix);
    }
}

