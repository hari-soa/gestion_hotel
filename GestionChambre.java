package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GestionChambre {
    float idChambre;
    String categorieChambre;
    disponibilte disponibilte;
    private enum disponibilte {
        libre,prie
    }

}
