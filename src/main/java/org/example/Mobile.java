package org.example;

public class Mobile extends Payement {
    public Mobile(float solde) { super(solde); }

    @Override
    public void verserAuGerant(float montant, Gerant gerant) {
        gerant.verserMobile(montant);
    }
}