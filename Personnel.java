package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter

public class Personnel {
    private String nom;
    private String prenom;
    private String status;

    public String obtenirNomComplet() {
        return nom + " " + prenom;
    }
}
