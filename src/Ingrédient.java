public class Ingrédient {

    private String nom;
    private double quantite;
    private String unite;

    public Ingrédient(String nom, double quantite, String unite) {
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;
    }
    public String afficher() {
        return this.nom + ":" + this.quantite + " " + this.unite;
    }
    public String getNom() {
        return this.nom;
    }
    public double getQuantite() {
        return this.quantite;
    }
    public String getUnite() {
        return this.unite;
    }
    public void setQuantite(double quantite) {
        if (quantite < 0) {
            System.out.println("impossible");
        }
        else {
            this.quantite = quantite;
        }
    }

}
