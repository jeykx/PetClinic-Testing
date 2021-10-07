package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FindOwnersPage;

public class FindOwnersStepDefinition {

    private final BaseUtil base;

    public FindOwnersStepDefinition(BaseUtil base) {
        this.base = base;
    }

   /* public static final WebDriver driver = new ChromeDriver();*/


    @Given("i am on the home page of the website")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {

    }

    @When("i click on the {string} link")
    public void jeCliqueSurLeLienFindOwners() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickLinkOwner();

    }

    @And("i click on the {string} button for access all owners")
    public void jeCliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickFindOwner();

    }

    @Then("i access the list of all owners")
    public void jAccèdeÀLaListeDeTousLesPropriétaires() {
    }


    @Given("i am on the home page of the website url")
    public void queJeSuisSurLaPageFindOwners() {

    }

    @And("i click on the {string} link in the navbar")
    public void clickLinkFoNav() {

    }

    @When("i fill form")
    public void jeSaisiLeNomDuPropriétaireDansLeChamp() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchOwner();
    }

    @And("click on the {string} button")
    public void CliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchClickOwner();


    }


    @Then("the owner's details are displayed")
    public void lesInformationsDuPropriètaireSAffiche() {
    }

    // Scenario Outline //

    @Given("i am good on the home page of the website")
    public void queJeSuisSurLaPageFindOwnersOutline() {

    }

    @And("click on the {string} link in the navbar")
    public void clickLinkFoNavOutline() {

    }

    @When("i fill form {string}")
    public void jeSaisiLeNomDuPropriétaireDansLeChampoutiline() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchOwner();
    }

    @And("i click on the {string} button")
    public void CliqueSurLeBoutonFindOwnerOutline() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchClickOwner();


    }


    @Then("the owner's details are good displayed")
    public void lesInformationsDuPropriètaireSAfficheOutline() {
    }
}
