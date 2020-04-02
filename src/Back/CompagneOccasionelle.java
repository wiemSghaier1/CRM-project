package Back;

import java.util.Date;

public class CompagneOccasionelle extends Compagne {

    protected String evenementInhabituel;

    public CompagneOccasionelle(String compId, String objectifCommerciale, String lieu, String typeClient, String formeAnonce, String equipeCommerciale, String message, Produit produit, Promotion promotion, Date dateDeb, Date dateFin, String evenementInhabituel) {
        super(compId, objectifCommerciale, lieu, typeClient, formeAnonce, equipeCommerciale, message, produit, promotion, dateDeb, dateFin);
        this.evenementInhabituel = evenementInhabituel;
    }

    public String getEvenementInhabituel() {
        return evenementInhabituel;
    }

    public void setEvenementInhabituel(String evenementInhabituel) {
        this.evenementInhabituel = evenementInhabituel;
    }
}
