package gestion_hotel.src.main.java.gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Personnel {
    private String nom;
    private String prenom;
    private String status;
    private Gerant gerant;

    public Personnel(String nom, String prenom, String contact) {
    }

    public String obtenirNomComplet() {
        return nom + " " + prenom;
    }
}
