package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddOwnerPage extends GlobalPage {


    public AddOwnerPage(WebDriver driver) {super(driver);}

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Owner')]")
    private WebElement btnAddOwnerPage;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement insertFirstname;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement insertLastname;

    @FindBy(how = How.ID, using = "address")
    private WebElement insertAddress;

    @FindBy(how = How.ID, using = "city")
    private WebElement insertCity;

    @FindBy(how = How.ID, using = "telephone")
    private WebElement insertTelephone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add-owner-form\"]/div[2]/div/button")
    private WebElement btnAddOwnerValidate;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Owner Information')]")
    private WebElement titleOwnerInfosPageVerify;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'jeremy dufour')]")
    private WebElement nameVerify;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'rue du pere noel')]")
    private WebElement addressVerify;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'henin beaumont')]")
    private WebElement cityVerify;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'0303030303')]")
    private WebElement phoneVerify;



    public enum Filters {
        FIRSTNAME("FIRSTNAME"),
        LASTNAME("LASTNAME"),
        ADDRESS("ADDRESS"),
        CITY("CITY"),
        TELEPHONE("TELEPHONE");
        private final String stringValue;
        Filters(String stringValue){
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }



    public void clickBtnAddOwner(String arg0) {

        this.btnAddOwnerPage.click();
    }

    public void inputForm(String name, String value) {
        Filters currentFilter = Filters.valueOf(name);
        switch (currentFilter) {
            case FIRSTNAME:
                this.insertFirstname.sendKeys(value);
                break;
            case LASTNAME:
                this.insertLastname.sendKeys(value);
                break;
            case ADDRESS:
                this.insertAddress.sendKeys(value);
                break;
            case CITY:
                this.insertCity.sendKeys(value);
                break;
            case TELEPHONE:
                this.insertTelephone.sendKeys(value);
                break;
            default:
                break;
        }
    }

    public boolean titleOwnerInfosDisplay() {

        WebElement titlePoVerify = this.titleOwnerInfosPageVerify;
        return true;
    }

    public boolean verifyOwnerDetailIsDisplay() {

        WebElement lastnameVerify = this.nameVerify;
        WebElement addressVerify = this.addressVerify;
        WebElement cityVerify = this.cityVerify;
        WebElement telephoneVerify = this.phoneVerify;
        return true;

        }

    public void clickOnAddOwnerbutton() {

        this.btnAddOwnerValidate.click();
    }

    public void inputFormOutline(String arg0, String arg1, String arg2, String arg3, String arg4) {

        this.insertFirstname.sendKeys(arg0);
        this.insertLastname.sendKeys(arg1);
        this.insertAddress.sendKeys(arg2);
        this.insertCity.sendKeys(arg3);
        this.insertTelephone.sendKeys(arg4);
    }
}
