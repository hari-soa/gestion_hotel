package org.example;
public class Cash extends Payement {
    public Cash() {
        super(0);
    }

    @Override
    public void verserAuGerant(float montant, Gerant gerant) {
        gerant.verserCash(montant);
    }
}