import services.importations.ServiceClient;
import services.interfaces.ServicesClientInterface;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        // ServicesClientInterface monServices = new ServiceClient();

        ServiceClient monServices = new ServiceClient();
        monServices.getSoldeCompte();


        // output results
        System.out.println("Hello world!");

    }
}