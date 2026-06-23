package gestion_hotel;

import lombok.Getter;

@Getter

public class Gerant extends Personnel{
    private float compteBancaireHotel;
    private float soldeMobileHotel;
    private float caisseCash;

    public Gerant(String nom, String prenom, String contact, float soldeMobileHotel, float caisseCash, float compteBancaireHotel) {
        super(nom, prenom, contact);
        this.soldeMobileHotel = soldeMobileHotel;
        this.compteBancaireHotel = compteBancaireHotel;
        this.caisseCash = caisseCash;
    }

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



