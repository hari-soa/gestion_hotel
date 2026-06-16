package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Personnel {
    private String nom;
    private String prénom;
    private String status;
    private Gérant gerant;
}
