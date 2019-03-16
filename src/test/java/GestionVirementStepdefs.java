import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class GestionVirementStepdefs {

    private Compte compteCheque;
    private Compte compteEpargne;
    private String statutDuVirement;

    @Given("^j'ai un compte cheque avec un solde de (\\d+)€$")
    public void jAiUnCompteChequeAvecUnSoldeDe€(int soldeCompteCheque) {
        Compte compteCheque = new Compte ("Compte chèque", soldeCompteCheque);
    }

    @Given("^j'ai un compte épargne avec un solde de (\\d+)€$")
    public void jAiUnCompteÉpargneAvecUnSoldeDe€(int soldeCompteEpargne) {
        Compte compteEpargne = new Compte ("Compte epargne", soldeCompteEpargne);
    }

    @When("^j'effectue un virement de (\\d+)€ du compte cheque vers le compte épargne$")
    public void jEffectueUnVirementDe€DuCompteChequeVersLeCompteÉpargne(int montantDuVirement) {
        GestionVirement virement = new GestionVirement(compteCheque,compteEpargne, montantDuVirement);
    }

    @Then("^le solde du compte cheque est (\\d+)€$")
    public void leSoldeDuCompteChequeEst€(int nouveauSoldeCompteCheque) {
        Assert.assertEquals(compteCheque.getSoldeDuCompte(),nouveauSoldeCompteCheque);
    }

    @Then("^le solde du compte épargne est (\\d+)€$")
    public void leSoldeDuCompteÉpargneEst€(int nouveauSoldeCompteEpargne) {
        Assert.assertEquals(compteEpargne.getSoldeDuCompte(),nouveauSoldeCompteEpargne);
    }

    @Then("^le virement est confirmé$")
    public void leVirementEstConfirmé() {
        Assert.assertEquals(GestionVirement.getStatutDuVirement(), StatutDuVirement.OK);
    }
}
