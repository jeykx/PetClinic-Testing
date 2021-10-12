package stepDefinitions;

import base.BaseUtil;
import org.junit.Assert;
import pageObjects.GlobalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.VeterinariansPage;

public class VeterinariansStepDefinition {

    private final BaseUtil base;

    public VeterinariansStepDefinition(BaseUtil base) { this.base = base; }

    @Given("i am on the home page of the website petclinic")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {

        HomePage homePage = new HomePage(base.driver);
        Assert.assertTrue(homePage.homePageVerify());

    }

    @When("click on the {string} link")
    public void jeCliqueSurLeLien(String arg0) {
        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);


    }

    @Then("i am redirected to the list of vets")
    public void jeSuisRedirigéVersLaListeDesVétérinaires() {

        VeterinariansPage veterinariansPage = new VeterinariansPage(base.driver);
        Assert.assertTrue(veterinariansPage.veterinariansPageVerify());
    }
}
