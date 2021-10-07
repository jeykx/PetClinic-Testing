package stepDefinitions;

import base.BaseUtil;
import pageObjects.VeterinariansPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VeterinariansStepDefinition {

    private final BaseUtil base;
    /*public static final WebDriver driver = new ChromeDriver();*/


    public VeterinariansStepDefinition(BaseUtil base) { this.base = base; }

    @Given("i am on the home page of the website petclinic")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {


    }

    @When("click on the {string} link")
    public void jeCliqueSurLeLien() {
        VeterinariansPage veterinariansPage = new VeterinariansPage(base.driver);
        veterinariansPage.ClickVeto();


    }

    @Then("i am redirected to the list of vets")
    public void jeSuisRedirigéVersLaListeDesVétérinaires() {}
}
