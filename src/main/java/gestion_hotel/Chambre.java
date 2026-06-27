package gestion_hotel.src.main.java.gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Chambre {
    private float idChambre;
    private CategorieChambre categorie;
    private disponibilte disponibilite;
     enum disponibilte {
        libre,prie,reserve
    }
}
