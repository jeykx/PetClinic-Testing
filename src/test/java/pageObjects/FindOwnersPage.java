package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindOwnersPage extends GlobalPage {


    public FindOwnersPage(WebDriver driver) {super(driver);}

    @FindBy(how = How.ID, using = "lastName")
    private WebElement insertLastname;

    @FindBy(how = How.XPATH, using = "//table[@id='vets']")
    private WebElement ownersTableVerify;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'George Franklin')]")
    private WebElement ownerNameDisplayVerify;

    public void searchOwnerFormOut(String arg0) {

        this.insertLastname.sendKeys(arg0);
    }

    public boolean ownersListVisible() {

        WebElement tableVerify = this.ownersTableVerify;
        return true;
    }

    public boolean nameOwnerIsDisplay() {

        WebElement nameOwner = this.ownerNameDisplayVerify;
        return true;
    }


    public enum Filters {

        LASTNAME("LASTNAME");

        private final String stringValue;
        Filters(String stringValue){
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }


    public void searchOwnerForm(String name, String value) {
        AddOwnerPage.Filters currentFilter = AddOwnerPage.Filters.valueOf(name);
        switch (currentFilter) {

            case LASTNAME:
                this.insertLastname.sendKeys(value);
                break;
            default:
                break;
        }

    }
}
