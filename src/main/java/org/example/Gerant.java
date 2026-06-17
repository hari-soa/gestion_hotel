package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor


public class Gerant {
    private String nom;
    private String prenom;
    private String contact;
    private TypePayement typePayement;
}


