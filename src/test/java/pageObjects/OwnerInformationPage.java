package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OwnerInformationPage extends GlobalPage {

    public OwnerInformationPage(WebDriver driver) {super(driver);}

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Pet')]")
    private WebElement AddNewPetRedirect;

    @FindBy(how = How.ID, using = "name")
    private WebElement insertPetName;

    @FindBy(how = How.ID, using = "birthDate")
    private WebElement insertPetBirthDate;

    @FindBy(how = How.ID, using = "type")
    private WebElement selectPetType;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Pet')]")
    private WebElement AddNewpetValidateBtn;

    public void UrlOwner() {

        driver.get("https://spring-petclinic-community.herokuapp.com/owners/11");
    }

    public void AddNewPetBtn(String arg0) {

        this.AddNewPetRedirect.click();
    }

    public enum Filters {
        NAME("NAME"),
        BIRTHDATE("BIRTHDATE"),
        TYPE("TYPE");
        private final String stringValue;
        Filters(String stringValue){
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }


    public void inputFormPet(String name, String value) {
        OwnerInformationPage.Filters currentFilter = OwnerInformationPage.Filters.valueOf(name);
        switch (currentFilter) {
            case NAME:
                this.insertPetName.sendKeys(value);
                break;
            case BIRTHDATE:
                this.insertPetBirthDate.sendKeys(value);
                break;
            case TYPE:
                new Select(this.selectPetType).selectByVisibleText(value);
                break;
            default:
                break;
        }
    }

    public void BtnAddPetValidate(String arg0) {

        this.AddNewpetValidateBtn.click();
    }

    public void fillsPetData(String arg0, String arg1, String arg2) {
    }
}
