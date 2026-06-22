package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Reservation {
    private Client client;
    private Date date;
    private Chambre chambre;
    private double prix;
    private StatutReservation statut;
}
