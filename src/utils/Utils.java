package utils;

import data.Client;
import data.Compte;

public class Utils {
    public void outputAccountSold(Client client) {
        System.out.println(
            "Bonjour Client n° " + client.getIdentifiant() + " - " 
            + client.getPrenom() + " " 
            + client.getNom() + " : \n"
            );

        for (Compte compte : client.getCompteList()) {
            System.out.println("Il vous reste sur votre compte " + compte.getCategorie() + " : " + compte.getSolde() + " euros.\n");
        }    
    }

    // public void realizeOperation() {
        
    // }
}
