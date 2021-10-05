package stepDefinitions;

import base.confUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.VeterinariansPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VeterinariansStepDefinition {

    private final confUtil base;
    public static final WebDriver driver = new ChromeDriver();


    public VeterinariansStepDefinition(confUtil base) { this.base = base; }

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
