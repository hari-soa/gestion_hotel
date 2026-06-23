package gestion_hotel;

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

    public String obtenirNomComplet() {
        return nom + " " + prenom;
    }
}
