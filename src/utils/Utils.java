package utils;

import data.Client;
import data.Compte;

public class Utils {
    /**
     * Affiche dans la console les informations sur le solde du compte client
     * @param client : le client dont on affiche les informations (nom, prénom, identifiant, les différents comptes)
     */
    public void outputAccountSold(Client client) {
        System.out.println(
            "Bonjour Client n° " + client.getIdentifiant() + " - " 
            + client.getPrenom() + " " 
            + client.getNom() + " : \n"
            );

        // affiche dynamique le solde et la catégorie de compte selon le nombre dont dispose le client
        for (Compte compte : client.getCompteList()) {
            System.out.println("Il vous reste sur votre compte " + compte.getCategorie() + " : " + compte.getSolde() + " euros.\n");
        }    
    }

}
