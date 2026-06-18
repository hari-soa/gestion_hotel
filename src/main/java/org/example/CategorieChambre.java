package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategorieChambre {
    private String nomCategorie;
    private float prixChambre;
    private int capacitePersonnes;
    private boolean aClimatisation;

    @Override
    public String toString() {
        return nomCategorie + " (" + capacitePersonnes + " pers, " +
                (aClimatisation ? "avec clim" : "sans clim") + ") - Prix: " + prixChambre + "Ar";
    }

    public void mettreAJourPrix(float nouveauPrix) {
        if (nouveauPrix > 0) {
            this.prixChambre = nouveauPrix;
        }
    }
}