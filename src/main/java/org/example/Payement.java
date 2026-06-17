package org.example;

import lombok.Getter;

@Getter

public class Payement extends CategorieChambre{
    private TypePayement typePayement;

    public Payement(float prix,  TypePayement typePayement) {
        super(prix);
        this.typePayement = typePayement;
    }
}
