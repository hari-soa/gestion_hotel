package gestion_hotel.src.main.java.gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategorieChambre {
    float id;
    float capacite;
    float prixParNuit;
    String nomCategorie;
}
