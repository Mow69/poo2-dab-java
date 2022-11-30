package data;

public class Client {
    // initialize attributes
    private String identifiant;
    private String nom;
    private String prenom;
    private Compte[] listeComptes;

    // constructors
    public Client() {}
    public Client(String identifiant, String nom, String prenom, Compte[] listeComptes) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.listeComptes = listeComptes;
    }

    // getters / setters
    // identifiant
    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    // nom
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // listeComptes
    public Compte[] getCompteList() {
        return listeComptes;
    }
    public void setCompteList(Compte[] listeComptes) {
        this.listeComptes = listeComptes;
    }
}
