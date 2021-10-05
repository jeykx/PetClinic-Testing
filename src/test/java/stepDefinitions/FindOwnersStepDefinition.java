package stepDefinitions;

import base.confUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.FindOwnersPage;

public class FindOwnersStepDefinition {

    private final confUtil base;

    public FindOwnersStepDefinition(confUtil base) {
        this.base = base;
    }

    public static final WebDriver driver = new ChromeDriver();


    @Given("i am on the home page of the website")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {

    }

    @When("i click on the {string} link")
    public void jeCliqueSurLeLienFindOwners() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickLinkOwner();

    }

    @And("i click on the {string} button")
    public void jeCliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.ClickFindOwner();

    }

    @Then("i access the list of all owners")
    public void jAccèdeÀLaListeDeTousLesPropriétaires() {
    }


    @Given("i am on the home page of the website")
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

    @And("i click on the {string} button")
    public void CliqueSurLeBoutonFindOwner() {
        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        findOwnersPage.SearchClickOwner();


    }


    @Then("the owner's details are displayed")
    public void lesInformationsDuPropriètaireSAffiche() {
    }

    // Scenario Outline //

    @Given("i am on the home page of the website")
    public void queJeSuisSurLaPageFindOwnersOutline() {

    }

    @And("i click on the {string} link in the navbar")
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


    @Then("the owner's details are displayed")
    public void lesInformationsDuPropriètaireSAfficheOutline() {
    }
}
