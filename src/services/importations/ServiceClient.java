package services.importations;

import services.interfaces.ServicesClientInterface;

public class ServiceClient implements ServicesClientInterface {
    @Override
    public boolean deposerEspeces(int m_montantADeposer) {
        // boolean depotOK = m_montantADeposer>0;
        // Par défaut, l'opération n'a pas aboutie
        boolean depotOK = false;
        if(m_montantADeposer>0) {
            depotOK = true;
        }
        // L'opération a aboutie
        return depotOK;
    }

    @Override
    public boolean retirerEspeces(int m_montantARetirer) {
        return false;
    }

    public float getSoldeCompte() {
        return 0;
    }
}
