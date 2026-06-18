package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    public Client(String telephone) {
        this.telephone = telephone;
    }

    public String getNom() {
        return nom + " " + prenom;
    }
}
