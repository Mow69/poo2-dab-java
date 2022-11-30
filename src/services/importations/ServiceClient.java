package services.importations;

import data.Compte;
import services.interfaces.ServicesClientInterface;

public class ServiceClient implements ServicesClientInterface {
    // private int espece;
    // private int cheque;

    // @Override
    // public boolean deposerEspeces(int m_montantADeposer) {
    //     // boolean depotOK = m_montantADeposer>0;
    //     // Par défaut, l'opération n'a pas aboutie
    //     boolean depotOK = false;
    //     if(m_montantADeposer>0) {
    //         depotOK = true;
    //     }
    //     // L'opération a aboutie
    //     return depotOK;
    // }

    @Override
    public boolean deposer(Compte m_compte, int m_montantADeposer) {
        // boolean depotOK = m_montantADeposer>0;
        // Par défaut, l'opération n'a pas aboutie
        boolean depotOK = false;
        if(m_montantADeposer>0) {
            depotOK = true;
            m_compte.setSolde(m_compte.getSolde() - m_montantADeposer);
        }
        // L'opération a aboutie
        return depotOK;
    }

    // @Override
    // public boolean retirerEspeces(int m_montantARetirer) {
    //     return false;
    // }

    @Override
    public boolean retirer(Compte m_compte, int m_montantARetirer) {
        boolean retraitOK = false;
        if(m_montantARetirer>0) {
            retraitOK = true;
            // if("Epargne" == m_compte.getCategorie()) { 
            // }
            // if("Chèque" == m_compte.getCategorie()) {
            // }
        }
        // L'opération a aboutie
        return retraitOK;    }


    // public float getSoldeCompte() {
    //     return 0;
    // }
    @Override
    public int consulterSoldeCompte(Compte compte) {
        return compte.getSolde();
    }
}
