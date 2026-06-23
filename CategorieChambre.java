package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategorieChambre {
    float id;
    float capacite;
    float prixChambre;
    String nomCategorie;
}
