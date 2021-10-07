package stepDefinitions;

import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import pageObjects.AddOwnerPage;
import pageObjects.GlobalPage;

import java.util.List;
import java.util.Map;

public class AddOwnerStepDefinition {

    private BaseUtil base;

    public AddOwnerStepDefinition(BaseUtil base) {
        this.base = base;
    }

    /*public static final WebDriver driver = new ChromeDriver();*/

    @Given("I'm on {string} page")
    public void PageFindOwners(String arg0) {
        /**AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.VisibleBtn(arg0);*/
        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);
    }

    @And("i click on {string} button")
    public void queJeCliqueSurLeBouton(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.ClickBtnAddOwner(arg0);
    }

    @And("I fill form in the following:")
    public void fillFormNewOwner(DataTable table) {
        List<Map<String, String>> allDatas = table.asMaps(String.class, String.class);
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        for (Map<String, String> data : allDatas) {
            addOwnerPage.inputForm(data.get("locator"), data.get("value"));
        }

    }

    @When("I click on {string} button")
    public void jeCliqueSurLeBoutonAddOwner(String arg0) {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.clickOnAddOwnerbutton();
    }


    @Then("I'm redirected on page with title {string}")
    public void laFicheDuPropriétaireAiBienCréé() {
    }

    @And("I control that print information :")
    public void verifyinfos() {


    }

    @Given("i'm on the page for creating a new owner")
    public void iMOnThePageForCreatingANewOwner() {
    }

    @When("i click on the confirmation button {string} without filling in the required fields")
    public void iClickOnTheConfirmationButtonWithoutFillingInTheRequiredFields(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.clickOnAddOwnerbutton();

    }

    @Then("the error message {string} is displayed below each field")
    public void theErrorMessageIsDisplayedBelowEachField(String arg0) {
        Assert.assertEquals("ne peut pas être vide", arg0);
    }

    // Scenario outline

    @Given("i'm on {string} page")
    public void iMOnPage(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.VisibleBtn(arg0);

    }

    @And("i click on the {string} button to access the form")
    public void clickBtnAddPet(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.ClickBtnAddOwner(arg0);

    }

    @And("I fill form in the following {string} and {string} and {string} and {string} and {string}")
    public void iFillFormInTheFollowingAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4, DataTable table) {

        List<Map<String, String>> allDatas = table.asMaps(String.class, String.class);
        for (Map<String, String> ignored : allDatas) {
            AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
            addOwnerPage.inputFormOutline(arg0,arg1,arg2,arg3,arg4);
        }

    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.clickOnAddOwnerbutton();

    }

    @Then("I'am redirected on page with title {string}")
    public void iAmRedirectedOnPageWithTitle(String arg0) {
    }
}
