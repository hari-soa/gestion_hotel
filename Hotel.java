package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Hotel {
    private String adresse;
    private String nom;
    private Gerant gérant;

    private List<Personnel> personnels;
    private List<GestionChambre> chambres;

    public void ajouterPersonnel(Personnel personnel) {
        personnels.add(personnel);
    }

    public void supprimerPersonnel(Personnel personnel) {
        personnels.remove(personnel);
    }

    public void ajouterChambre(GestionChambre chambre) {
        chambres.add(chambre);
    }

    public void supprimerChambre(GestionChambre chambre) {
        chambres.remove(chambre);
    }
}