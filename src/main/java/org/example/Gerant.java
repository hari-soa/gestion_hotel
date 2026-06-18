package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Gerant extends Bancaire {
    private String nom;
    private String prenom;
    private String contact;
    private TypePayement typePayement;
    private float compteBancaireHotel;
    private float numeroMobileHotel;

    public Gerant(float prix) {
        super(prix);
    }

    public void verser(float montant) {
        if (montant > 0) {
            this.compteBancaireHotel += montant;
        }
    }


}




