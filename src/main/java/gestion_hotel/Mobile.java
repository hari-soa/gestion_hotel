package gestion_hotel.src.main.java.gestion_hotel;

public class Mobile extends Payement {
    public Mobile(float solde) {
        super(solde);
    }

    @Override
    public void verserAuGerant(float montant, Gerant gerant) {
        gerant.verserMobile(montant);
    }
}