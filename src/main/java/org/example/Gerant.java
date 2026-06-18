package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Gerant {
    private String nom;
    private String prenom;
    private String contact;
    private float compteBancaireHotel;
    private float soldeMobileHotel;
    private float caisseCash;

    public void verserBancaire(float montant) {
        if (montant > 0) {
            this.compteBancaireHotel += montant;
        } else {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
    }

    public void verserMobile(float montant) {
        if (montant > 0) {
            this.soldeMobileHotel += montant;
        } else {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
    }

    public void verserCash(float montant) {
        if (montant > 0) {
            this.caisseCash += montant;
        }
    }
}



