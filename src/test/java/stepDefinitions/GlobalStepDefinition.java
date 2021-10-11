package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import pageObjects.GlobalPage;

public class GlobalStepDefinition {

    public BaseUtil base;

    public GlobalStepDefinition(BaseUtil base) {
        this.base = base;
    }

    @Given("I'm on {string} section")
    public void clickOnMenu(String arg0) {

        GlobalPage globalPage = new GlobalPage(base.driver);
        globalPage.clikOnMenuName(arg0);
    }
}
