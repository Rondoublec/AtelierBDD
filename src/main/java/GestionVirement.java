public class GestionVirement {

    private int soldeDuCompteSource;
    private int soldeDuCompteCible;
    private int montantDuVirement;
    private static StatutDuVirement statutDuVirement;

    public GestionVirement(Compte compteCheque, Compte compteLivret, int montantVirement) {
        this.soldeDuCompteSource = compteCheque.getSoldeDuCompte();
        this.soldeDuCompteCible = compteLivret.getSoldeDuCompte();
        this.montantDuVirement = montantVirement;
        soldeDuCompteSource =- montantDuVirement;
        soldeDuCompteCible =+ montantDuVirement;
        compteCheque.setSoldeDuCompte(soldeDuCompteSource);
        compteLivret.setSoldeDuCompte(soldeDuCompteCible);
        this.statutDuVirement = StatutDuVirement.OK;
    }

    public static StatutDuVirement getStatutDuVirement() {
        return statutDuVirement;
    }
}
