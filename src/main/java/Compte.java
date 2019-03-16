public class Compte {

    private String nomDuCompte;
    private int soldeDuCompte;

    public Compte(String nomDuCompte, int soldeDuCompte){
        this.nomDuCompte = nomDuCompte;
        this.soldeDuCompte = soldeDuCompte;
    }
    public String getNomDuCompte() {
        return nomDuCompte;
    }

    public int getSoldeDuCompte() {
        return soldeDuCompte;
    }

    public void setSoldeDuCompte(int soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;
    }
}
