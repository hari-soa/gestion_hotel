package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Hotel {
    private String adresse;
    private String nom;
    private Classe_hoteliere classe;
    private Gerant gerant;
    private List<Personnel> personnels;
    private List<GestionChambre> chambres;
    private List<Reservation> reservations;
    private Gerant gérant;

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

    public Reservation creerReservation(
            Date date,
            GestionChambre chambre,
            Payement payement,
            Client client) {

        double prix = chambre.getCategorieChambre().getPrixChambre();
        String resultat = payement.executerPayement(gerant, GestionChambre.getCategorieChambre());
        StatutReservation statut = resultat.startsWith("Erreur") ? StatutReservation.ENCOURS : StatutReservation.PAYE;

        Reservation reservation = new Reservation(client, date, chambre, prix, statut);

        reservations.add(reservation);
        chambre.setDisponibilite(GestionChambre.disponibilte.prie);

        return reservation;
    }

    public void annulerReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getChambre().setDisponibilite(GestionChambre.disponibilte.libre);
    }

    public List<GestionChambre> listerChambresDisponibles() {
        return chambres.stream()
                .filter(GestionChambre.getDisponibilte())
                .collect(Collectors.toList());
    }
}
}
