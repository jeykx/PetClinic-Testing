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
    private WebElement InserPetName;

    @FindBy(how = How.ID, using = "birthDate")
    private WebElement InsertPetBirthDate;

    @FindBy(how = How.ID, using = "type")
    private WebElement SelectPetType;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Pet')]")
    private WebElement AddNewpetValidateBtn;

    public void UrlOwner() {

        driver.get("https://spring-petclinic-community.herokuapp.com/owners/11");
    }

    public void AddNewPetBtn() {

        this.AddNewPetRedirect.click();
    }

    public void FillsPet() {

        this.InserPetName.sendKeys("Mosquito");
        this.InsertPetBirthDate.sendKeys("2014-12-15");
        new Select(this.SelectPetType).selectByVisibleText("dog");
    }

    public void BtnAddPetValidate() {

        this.AddNewpetValidateBtn.click();
    }

}
