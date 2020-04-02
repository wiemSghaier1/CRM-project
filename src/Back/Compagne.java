package Back;

import java.util.Date;

public class Compagne {

    protected String compId;
    protected String objectifCommerciale;
    protected String lieu;
    protected String typeClient;
    protected String formeAnonce;
    protected String equipeCommerciale;
    protected String message;
    protected Produit produit;
    protected Promotion promotion;
    protected Date dateDeb;
    protected Date dateFin;

    public Compagne(String compId, String objectifCommerciale, String lieu, String typeClient, String formeAnonce, String equipeCommerciale, String message, Produit produit, Promotion promotion, Date dateDeb, Date dateFin) {
        this.compId = compId;
        this.objectifCommerciale = objectifCommerciale;
        this.lieu = lieu;
        this.typeClient = typeClient;
        this.formeAnonce = formeAnonce;
        this.equipeCommerciale = equipeCommerciale;
        this.message = message;
        this.produit = produit;
        this.promotion = promotion;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getObjectifCommerciale() {
        return objectifCommerciale;
    }

    public void setObjectifCommerciale(String objectifCommerciale) {
        this.objectifCommerciale = objectifCommerciale;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public String getFormeAnonce() {
        return formeAnonce;
    }

    public void setFormeAnonce(String formeAnonce) {
        this.formeAnonce = formeAnonce;
    }

    public String getEquipeCommerciale() {
        return equipeCommerciale;
    }

    public void setEquipeCommerciale(String equipeCommerciale) {
        this.equipeCommerciale = equipeCommerciale;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
