package gestion_hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Payement {
    private float solde;

    public Payement(float solde) {
        this.solde = solde;
    }

    public String executerPayement(Gerant gerant, CategorieChambre nomCategorie) {
        float montant = nomCategorie.getPrixChambre();

        if (montant <= 0) return "Erreur : Prix de chambre invalide.";
        if (this.solde < montant) return "Erreur : Solde insuffisant.";

        verserAuGerant(montant, gerant);

        this.solde -= montant;

        return "Paiement de " + montant + "Ar effectué pour la catégorie : " + nomCategorie.getNomCategorie();
    }

    public abstract void verserAuGerant(float montant, Gerant gerant);
}