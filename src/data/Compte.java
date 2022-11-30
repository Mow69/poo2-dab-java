package data;

public class Compte {
    // initialize attributes
    private String categorie;
    private int solde;

    // constructors
    public Compte() {};
    public Compte(String categorie, int solde) {
        this.categorie = categorie;
        this.solde = solde;
    };

    // getters / setters
    // categorie de compte (chèque, épargne...)
    public String getCategorie() {
        return categorie;
    } 

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // solde
    public int getSolde() {
        return solde;
    } 

    public void setSolde(int solde) {
        this.solde = solde;
    }
}
