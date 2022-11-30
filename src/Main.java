import java.util.Scanner;

import data.Client;
import data.Compte;
import services.importations.ServiceClient;
import utils.Utils;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // initialize utils
        Utils utils = new Utils();

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

        // teste la différence entre type interface et implémentations
        // ServiceClient monServices = new ServiceClient();
        // monServices.getSoldeCompte();
        // int soldeCompteCheque = monServices.consulterSoldeCompte(compteCheque);
        // monServices.consulterSoldeCompte(compteEpargne);

        // Instancialisation monService
        ServiceClient monServices = new ServiceClient();
        // monServices.deposer(compteEpargne, 10);

        // output results
        utils.outputAccountSold(client);

        // input handle
        try (Scanner inputValue = new Scanner(System.in)) {
            String m_operationSaisie;
            String m_montantSaisi;
            
            // Enter amount and press Enter
            System.out.println("Entrez une opération : \nsoit [1] pour déposer un montant, \nsoit [2] pour retirer un montant."); 
            m_operationSaisie = inputValue.nextLine();  
            int m_operation = Integer.parseInt(m_operationSaisie);


            // Enter amount and press Enter
            System.out.println("Entrez un montant :"); 
            m_montantSaisi = inputValue.nextLine();   

            // monServices.deposer(compteEpargne, Integer.parseInt(m_montantSaisi));
            monServices.realizeOperation(m_operation, compteEpargne, Integer.parseInt(m_montantSaisi));

            // output actualized results
            utils.outputAccountSold(client);
        } catch (NumberFormatException e) {
            System.out.println("Oups ! Erreur sur l'opération saisie ou le montant saisi.\n"); 
            e.printStackTrace();
        }

    }
}