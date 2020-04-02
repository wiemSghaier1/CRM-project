package Back;

public class Promotion {

    protected int qte;
    protected int remise ;

    public Promotion(int qte, int remise) {
        this.qte = qte;
        this.remise = remise;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }
}
