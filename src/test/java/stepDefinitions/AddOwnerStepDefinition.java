package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddOwnerPage;

public class AddOwnerStepDefinition {

    private final BaseUtil base;

    public AddOwnerStepDefinition(BaseUtil base) {
        this.base = base;
    }

    public static final WebDriver driver = new ChromeDriver();

    @Given("que le bouton est visible")
    public void PageFindOwners() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.VisibleBtn();
    }

    @And("que je clique sur le bouton {string}")
    public void queJeCliqueSurLeBouton(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.ClickBtnAddOwner();
    }

    @And("que j’ai saisi mon prénom")
    public void queJAiSaisiMonPrénom() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerFirstname();

    }

    @And("que j’ai saisi mon nom")
    public void queJAiSaisiMonNom() {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerName();
    }


    @And("que j’ai saisie mon adresse")
    public void queJAiSaisieMonAdresse() {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerAddress();
    }


    @And("que j'ai saisie ma ville")
    public void queJAiSaisieMaVille() {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerCity();
    }


    @And("que j’ai saisi mon numéro de téléphone")
    public void queJAiSaisiMonNuméroDeTéléphone() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerTel();
    }


    @When("je clique sur le bouton “Add Owner”")
    public void jeCliqueSurLeBoutonAddOwner() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.OwnerBtnConfirm();
    }


    @Then("la fiche du propriétaire ai bien créé")
    public void laFicheDuPropriétaireAiBienCréé() {
    }
}
