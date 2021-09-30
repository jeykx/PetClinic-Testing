package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.VeterinariansPage;
import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VeterinariansStepDefinition {

    private BaseUtil base;
    public static final WebDriver driver = new ChromeDriver();


    public VeterinariansStepDefinition(BaseUtil base) { this.base = base; }

    @Given("que je suis sur la page d'accueil du site web")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {


    }

    @When("je clique sur le lien VETENARIANS")
    public void jeCliqueSurLeLien() {
        VeterinariansPage veterinariansPage = new VeterinariansPage();
        veterinariansPage.ClickVeto();


    }

    @Then("je suis redirigé vers la liste des vétérinaires")
    public void jeSuisRedirigéVersLaListeDesVétérinaires() {}
}
