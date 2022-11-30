package data;

public class Compte {
    private String categorie;
    private int solde;

    public Compte() {};
    public Compte(String categorie, int solde) {
        this.categorie = categorie;
        this.solde = solde;
    };

    public String getCategorie() {
        return categorie;
    } 

    public void SetCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getSolde() {
        return solde;
    } 

    public void setSolde(int solde) {
        this.solde = solde;
    }
}
