package stepDefinitions;

import base.confUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddOwnerPage;

public class AddOwnerStepDefinition {

    private final confUtil base;

    public AddOwnerStepDefinition(confUtil base) {
        this.base = base;
    }

    public static final WebDriver driver = new ChromeDriver();

    @Given("I'm on {string} page")
    public void PageFindOwners() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.VisibleBtn();
    }

    @And("i click on {string} button")
    public void queJeCliqueSurLeBouton(String arg0) {

        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.ClickBtnAddOwner();
    }

    @And("I fill form in the following:")
    public void queJAiSaisiMonPrénom() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.CreateOwnerFirstname();
        addOwnerPage.CreateOwnerName();
        addOwnerPage.CreateOwnerAddress();
        addOwnerPage.CreateOwnerCity();
        addOwnerPage.CreateOwnerTel();

    }


    @When("I click on {string} button")
    public void jeCliqueSurLeBoutonAddOwner() {
        AddOwnerPage addOwnerPage = new AddOwnerPage(base.driver);
        addOwnerPage.OwnerBtnConfirm();
    }


    @Then("I'm redirected on page with title {string}")
    public void laFicheDuPropriétaireAiBienCréé() {
    }

    @And("I control that print information :")
    public void verifyinfos() {

    }
}
