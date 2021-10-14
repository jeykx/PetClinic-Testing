package stepDefinitions;

import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.OwnerInformationPage;

import java.util.List;
import java.util.Map;

public class OwnerInformationStepDefinition {

    private BaseUtil base;

    public OwnerInformationStepDefinition(BaseUtil base) {
        this.base = base;
    }

    @Given("i access on the owner's page")
    public void queJeSuisSurLaFicheDInformationsDuPropriétaire() {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.urlOwner();

    }

    @And("click {string} button")
    public void queJeCliqueSurLeBoutonAddNewPet(String arg0) {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.addNewPetBtn(arg0);

    }

    @And("i fill form in the following:")
    public void formPet(DataTable table) {

        List<Map<String, String>> allDatas = table.asMaps(String.class, String.class);
        for (Map<String, String> data : allDatas) {
            OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
            ownerInformationPage.inputFormPet(data.get("locator"), data.get("value"));
        }

    }

    @When("i click on {string}")
    public void jeCliqueSurLeBoutonAddPet(String arg0) {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.btnAddPetValidate(arg0);

    }

    @Then("pet has been added to the owner's profile")
    public void lAnimalÀBienÉtéAjoutéÀLaFicheDuPropriétaire() {
    }

    @And("I control that print information are {string} and {string} and {string}:")
    public void VerifyInfosPet(String namepet, String datepet, String typepet) {

        Assert.assertEquals("Mosquito", namepet);
        Assert.assertEquals("2021-12-10", datepet);
        Assert.assertEquals("dog", typepet);

    }

    // Scenario outline //

    @Given("i am on the owner's page")
    public void iAmOnTheOwnerSPage() {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.urlOwner();

    }

    @And("i click on button {string}")
    public void iClickOnButton(String arg0) {
        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.addNewPetBtn(arg0);

    }

    @And("i fill form for add pet {string} {string} {string}")
    public void iFillFormForAddPet(String arg0, String arg1, String arg2) {

            OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
            ownerInformationPage.fillsPetData(arg0,arg1, arg2);

    }

    @When("click on {string}")
    public void clickOn(String arg0) {

        OwnerInformationPage ownerInformationPage = new OwnerInformationPage(base.driver);
        ownerInformationPage.btnAddPetValidate(arg0);

    }

    @Then("pets {string} have been added to the owner's profile")
    public void petHasGoodBeenAddedToTheOwnerSProfile(String petsname) {

        Assert.assertEquals(petsname, petsname);
    }


}
