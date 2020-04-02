package Back;

import java.util.Date;

public class CompagneReguliere extends Compagne {

    protected String evenement;

    public CompagneReguliere(String compId, String objectifCommerciale, String lieu, String typeClient, String formeAnonce, String equipeCommerciale, String message, Produit produit, Promotion promotion, Date dateDeb, Date dateFin, String evenement) {
        super(compId, objectifCommerciale, lieu, typeClient, formeAnonce, equipeCommerciale, message, produit, promotion, dateDeb, dateFin);
        this.evenement = evenement;
    }

    public String getEvenement() {
        return evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }
}
