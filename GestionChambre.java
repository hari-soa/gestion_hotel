package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class GestionChambre {
    private float idChambre;
    private String categorieChambre;
    private disponibilte disponibilite;
    private enum disponibilte {
        libre,prie,reserve
    }
    private LocalDate dateDebut;
    private LocalDate dateFin;
    public String getInfoPourGerant(){
        if (this.disponibilite == disponibilte.libre){
            return "La chambre est disponible";
        }
        return "Chambre occuoee du "+ dateDebut + " au " + dateFin;
    }
    public String getInfoPourClient(){
        if (this.disponibilite == disponibilte.libre){
            return "La chambre est disponible !";
        } else {
            return "Désolé, la chambre est déjà prise.";
        }
    }
}
