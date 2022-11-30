package services.interfaces;

import data.Compte;

public interface ServicesClientInterface {
    // constantes des opérations
    public final int OPERATION_DEPOSER = 1;
    public final int OPERATION_RETIRER = 2;

    /**
     * Fonction générique qui permet de déposer ou retirer de l'argent
     * @param m_operation : l'opération à réaliser : 
     * soit déposer (OPERATION_DEPOSER = 1) soit retirer (OPERATION_RETIRER = 2) de l'argent sur le compte
     * @param m_compte : Le compte du client est crédité ou débité d'un montant = m_montantSaisi
     * @param m_montantSaisi : montant d'argent à déposer ou retirer, ce montant est positif
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean realizeOperation(int m_operation, Compte m_compte, int m_montantSaisi);

    // /**
    //  * Fonction qui permet au client de déposer de l'argent
    //  * Le compte du client est crédité d'un montant = m_montantADeposer
    //  * @param m_montantADeposer : montant d'argent à déposer, ce montant est positif
    //  * @return : true si l'opération s'est bien déroulée
    //  */
    // public boolean deposerEspeces(int m_montantADeposer);

    public boolean deposer(Compte m_compte, int m_montantADeposer);

    // /**
    //  * Fonction qui permet au client de retirer de l'argent
    //  * Le compte du client est débité d'un montant = m_montantADeposer
    //  * @param m_montantARetirer : montant d'argent à retirer, ce montant est positif
    //  * @return : true si l'opération s'est bien déroulée
    //  */
    // public boolean retirerEspeces(int m_montantARetirer);

    // autre possibilité, préciser en argument le type de compte (espèce, chèque etc... compte courant, compte bancaire...)
    public boolean retirer(Compte m_compte, int m_montantARetirer);

    public int consulterSoldeCompte(Compte compte);
}
