package gestion_hotel.src.main.java.gestion_hotel;

public class Bancaire extends Payement {
    public Bancaire(float solde) {
        super(solde);
    }

    @Override
    public void verserAuGerant(float montant, Gerant gerant) {
        gerant.verserBancaire(montant);
    }
}
