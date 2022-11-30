import services.importations.ServiceClient;
import services.interfaces.ServicesClientInterface;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        // ServicesClientInterface monServices = new ServiceClient();

        // teste la différence enyte type interface et implémentations
        ServiceClient monServices = new ServiceClient();
        monServices.getSoldeCompte();


        // output results
        System.out.println("Hello world!");

    }
}