package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
<<<<<<< HEAD
@ToString
=======

>>>>>>> Hotel
public class Personnel {
    private String nom;
    private String prenom;
    private String status;
<<<<<<< HEAD
    private Gerant gerant;
=======
>>>>>>> Hotel

    public String obtenirNomComplet() {
        return nom + " " + prenom;
    }
}
