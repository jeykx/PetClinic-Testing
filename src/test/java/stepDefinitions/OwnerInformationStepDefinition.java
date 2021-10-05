package stepDefinitions;

import base.confUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.OwnerInformationPage;

public class OwnerInformationStepDefinition {

    private final confUtil base;

    public OwnerInformationStepDefinition(confUtil base) {this.base = base;}

    public static final WebDriver driver = new ChromeDriver();

    @Given("que je suis sur la fiche d’informations du propriétaire")
    public void queJeSuisSurLaFicheDInformationsDuPropriétaire() {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.UrlOwner();

    }

    @And("que je clique sur le bouton “Add New Pet”")
    public void queJeCliqueSurLeBoutonAddNewPet() {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.AddNewPetBtn();

    }

    @And("i fill form in the following:")
    public void formPet() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.FillsPet();

    }

    @When("i click on {string}")
    public void jeCliqueSurLeBoutonAddPet() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.BtnAddPetValidate();

    }

    @Then("pet has been added to the owner's profile")
    public void lAnimalÀBienÉtéAjoutéÀLaFicheDuPropriétaire() {
    }

    @And("I control that print information are:")
    public void VerifyInfosPet() {

    }
}
