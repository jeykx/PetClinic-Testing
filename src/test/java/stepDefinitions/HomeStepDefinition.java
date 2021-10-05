package stepDefinitions;

import base.confUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomeStepDefinition {

    public confUtil base;

    public HomeStepDefinition(confUtil base) {
        this.base = base;
    }


    @Given("i am well connected to the internet")
    public void queJeSuisBienConnectéÀInternet() {

    }

    @When("i enter the url in the “Google Chrome“ web browser")
    public void jeSaisiLURLDansLeNavigateurWeb() {
        HomePage homePage = new HomePage();
        homePage.WebConnexion();


    }

    @Then("i am redirected to the home page of the website")
    public void jeSuisRedirigéVersLaPageDAccueilDuSiteWeb() {

    }
}
