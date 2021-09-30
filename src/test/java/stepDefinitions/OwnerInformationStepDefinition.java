package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.OwnerInformationPage;

public class OwnerInformationStepDefinition {

    private final BaseUtil base;

    public OwnerInformationStepDefinition(BaseUtil base) {this.base = base;}

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

    @And("que j’ai saisi le nom de l’animal")
    public void queJAiSaisiLeNomDeLAnimal() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.NamePet();

    }

    @And("que j’ai saisie la date de naissance de l’animal")
    public void queJAiSaisieLaDateDeNaissanceDeLAnimal() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.BirthDatePet();

    }

    @And("que j’ai sélectionné le type de l’animal")
    public void queJAiSélectionnéLeTypeDeLAnimal() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.TypePet();

    }

    @When("je clique sur le bouton “Add Pet”")
    public void jeCliqueSurLeBoutonAddPet() {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.BtnAddPetValidate();

    }

    @Then("l’animal à bien été ajouté à la fiche du propriétaire")
    public void lAnimalÀBienÉtéAjoutéÀLaFicheDuPropriétaire() {
    }
}
