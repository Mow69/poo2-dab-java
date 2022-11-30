package services.interfaces;

import data.Compte;

public interface ServicesClientInterface {
    /**
     * Fonction qui permet au client de déposer de l'argent
     * Le compte du client est crédité d'un montant = m_montantADeposer
     * @param m_montantADeposer : montant d'argent à déposer, ce montant est positif
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean deposerEspeces(int m_montantADeposer);

    /**
     * Fonction qui permet au client de retirer de l'argent
     * Le compte du client est débité d'un montant = m_montantADeposer
     * @param m_montantARetirer : montant d'argent à retirer, ce montant est positif
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean retirerEspeces(int m_montantARetirer);

    // autre possibilité, préciser en argument le type de compte (espèce, chèque etc... compte courant, compte bancaire...)
    // public boolean retirer(Compte m_compte, int m_montantARetirer);


}
