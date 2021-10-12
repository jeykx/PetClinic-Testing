package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.HomePage;

public class HomeStepDefinition {

    public BaseUtil base;

    public HomeStepDefinition(BaseUtil base) {
        this.base = base;
    }


    @Given("i enter the url in the “Google Chrome“ web browser")
    public void queJeSuisBienConnectéÀInternet() {


    }

    @Then("i am redirected to the home page of the website")
    public void jeSuisRedirigéVersLaPageDAccueilDuSiteWeb() {

        HomePage homePage = new HomePage(base.driver);
        Assert.assertTrue(homePage.homePageVerify());

    }
}
