package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Hotel {
    private String adresse;
    private String nom;
    private Classe_hoteliere classe;
    private Gérant gérant;
}
