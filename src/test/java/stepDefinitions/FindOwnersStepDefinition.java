package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.FindOwnersPage;

public class FindOwnersStepDefinition {

    private final BaseUtil base;

    public FindOwnersStepDefinition(BaseUtil base) {
        this.base = base;
    }

    public static final WebDriver driver = new ChromeDriver();


    @Given("que je suis sur la page d’accueil du site web")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {

    }

    @When("je clique sur le lien “Find Owners”")
    public void jeCliqueSurLeLienFindOwners() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickLinkOwner();

    }

    @And("je clique sur le bouton “Find Owner”")
    public void jeCliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickFindOwner();

    }

    @Then("j'accède à la liste de tous les propriétaires")
    public void jAccèdeÀLaListeDeTousLesPropriétaires() {
    }


    @Given("que je suis sur la page Find Owners")
    public void queJeSuisSurLaPageFindOwners() {

    }

    @When("je saisi le nom du propriétaire dans le champ")
    public void jeSaisiLeNomDuPropriétaireDansLeChamp() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchOwner();
    }

    @And("que je clique sur le bouton “Find Owner”")
    public void CliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchClickOwner();


    }


    @Then("les informations du propriètaire s'affiche")
    public void lesInformationsDuPropriètaireSAffiche() {
    }
}
