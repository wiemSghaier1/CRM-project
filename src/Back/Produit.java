package Back;

public class Produit {

    protected String refProd;
    protected String type;
    protected String marque;
    protected String modele;

    public Produit(String refProd, String type, String marque, String modele) {
        this.refProd = refProd;
        this.type = type;
        this.marque = marque;
        this.modele = modele;
    }

    public String getRefProd() {
        return refProd;
    }

    public void setRefProd(String refProd) {
        this.refProd = refProd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
