package org.example;

public class Bancaire extends Payement {
    public Bancaire(float solde) {
        super(solde);
    }

    @Override
    public void verserAuGerant(float montant, Gerant gerant) {
        gerant.verserBancaire(montant);
    }
}
