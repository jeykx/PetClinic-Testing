package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomeStepDefinition {

    private BaseUtil base;

    public HomeStepDefinition(BaseUtil base) {
        this.base = base;
    }


    @Given("que je suis bien connecté à internet")
    public void queJeSuisBienConnectéÀInternet() {

    }

    @When("je saisi l’URL dans le navigateur web")
    public void jeSaisiLURLDansLeNavigateurWeb() {
        HomePage homePage = new HomePage();
        homePage.WebConnexion();


    }

    @Then("je suis redirigé vers la page d’accueil du site web")
    public void jeSuisRedirigéVersLaPageDAccueilDuSiteWeb() {

    }
}
