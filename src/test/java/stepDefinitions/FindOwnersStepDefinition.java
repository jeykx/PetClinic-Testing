package stepDefinitions;

import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.FindOwnersPage;
import pageObjects.GlobalPage;
import pageObjects.HomePage;

import java.util.List;
import java.util.Map;

public class FindOwnersStepDefinition {

    private final BaseUtil base;

    public FindOwnersStepDefinition(BaseUtil base) {
        this.base = base;
    }


    @Given("i am on the home page of the website")
    public void queJeSuisSurLaPageDAccueilDuSiteWeb() {

        HomePage homePage = new HomePage(base.driver);
        Assert.assertTrue(homePage.homePageVerify());

    }

    @When("i click on the {string} link")
    public void jeCliqueSurLeLienFindOwners(String arg0) {
        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);

    }

    @And("i click on the Find Owner button for access all owners")
    public void jeCliqueSurLeBoutonFindOwner() {
        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clickFindOwnerBtn();

    }

    @Then("i access the list of all owners")
    public void jAccèdeÀLaListeDeTousLesPropriétaires() {

        FindOwnersPage findOwnersPage = new FindOwnersPage(base.driver);
        Assert.assertTrue(findOwnersPage.ownersListVisible());
    }


    @Given("i am on the home page of the website url")
    public void queJeSuisSurLaPageFindOwners() {

        HomePage homePage = new HomePage(base.driver);
        Assert.assertTrue(homePage.homePageVerify());

    }

    @And("i click on the {string} link in the navbar")
    public void clickLinkFoNav(String arg0) {

        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);

    }

    @When("i fill form")
    public void jeSaisiLeNomDuPropriétaireDansLeChamp(DataTable table) {

        List<Map<String, String>> allDatas = table.asMaps(String.class, String.class);
        FindOwnersPage findOwnerPage = new FindOwnersPage(base.driver);
        for (Map<String, String> data : allDatas) {
            findOwnerPage.searchOwnerForm(data.get("locator"), data.get("value"));
        }
    }

    @And("click on the Find Owner button")
    public void CliqueSurLeBoutonFindOwner() {

        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clickFindOwnerBtn();

    }


    @Then("the owner's details are displayed")
    public void lesInformationsDuPropriètaireSAffiche() {

        FindOwnersPage findOwnerPage = new FindOwnersPage(base.driver);
        Assert.assertTrue(findOwnerPage.nameOwnerIsDisplay());
    }

    // Scenario Outline //

    @Given("i am good on the home page of the website")
    public void queJeSuisSurLaPageFindOwnersOutline() {

    }

    @And("click on the {string} link in the navbar")
    public void clickLinkFoNavOutline(String arg0) {

        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);

    }

    @When("i fill form {string}")
    public void jeSaisiLeNomDuPropriétaireDansLeChampoutiline(String arg0, DataTable table) {


        FindOwnersPage findOwnerPage = new FindOwnersPage(base.driver);

        findOwnerPage.searchOwnerFormOut(arg0);


    }

    @And("i click on the Find Owner button")
    public void CliqueSurLeBoutonFindOwnerOutline() {

        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clickFindOwnerBtn();

    }


    @Then("the owner's details are good displayed")
    public void lesInformationsDuPropriètaireSAfficheOutline() {
    }

}
