package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Mobile extends Client{
    private float montant;
    private float solde;

    public Mobile(String telephone) {
        super(telephone);

    }


}
