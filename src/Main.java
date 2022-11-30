import data.Client;
import data.Compte;
import services.importations.ServiceClient;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // initialize comptes
        Compte compteCheque = new Compte("Chèque", 480);
        Compte compteEpargne = new Compte("Epargne", 2000);

        // initialize comptes list
        Compte[] listeComptes = {compteCheque, compteEpargne};
        
        // initialize client
        Client client = new Client(
            "H5BRC7", 
            "Jean", 
            "Labruyère", 
            listeComptes
        );

                // compteCheque.setSolde(111);

        // ServicesClientInterface monServices = new ServiceClient();

        // teste la différence enyte type interface et implémentations
        ServiceClient monServices = new ServiceClient();
        // monServices.getSoldeCompte();
        // int soldeCompteCheque = monServices.consulterSoldeCompte(compteCheque);
        // monServices.consulterSoldeCompte(compteEpargne);

        monServices.deposer(compteEpargne, 10);


        // this.outputAccountSold(client);

        // output results
        System.out.println(
            "Bonjour Client n° " + client.getIdentifiant() + " - " 
            + client.getPrenom() + " " 
            + client.getNom() + " : \n"
            // + "Il vous reste sur votre compte " + client.getCompteList()[0].getCategorie() + " : " + client.getCompteList()[0].getSolde() + " euros.\n"
            // + "Il vous reste sur votre compte " + client.getCompteList()[1].getCategorie() + " : " + client.getCompteList()[0].getSolde() + " euros.\n"
            );

        for (Compte compte : client.getCompteList()) {
            System.out.println("Il vous reste sur votre compte " + compte.getCategorie() + " : " + compte.getSolde() + " euros.\n");
        }

    }

    // public String outputAccountSold(Client client) {
    //     System.out.println(
    //         "Bonjour Client n° " + client.getIdentifiant() + " - " 
    //         + client.getPrenom() + " " 
    //         + client.getNom() + " : \n"
    //         );

    //     for (Compte compte : client.getCompteList()) {
    //         System.out.println("Il vous reste sur votre compte " + compte.getCategorie() + " : " + compte.getSolde() + " euros.\n");
    //     }    
    // }
}