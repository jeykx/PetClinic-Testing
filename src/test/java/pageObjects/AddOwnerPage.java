package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddOwnerPage extends GlobalPage {

    public WebDriver driver = new ChromeDriver();

    public AddOwnerPage(WebDriver driver) {super(driver);}

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Owner')]")
    private WebElement BtnAddOwnerPage;

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

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Owner')]")
    private WebElement BtnAddOwnerValidate;

    public void VisibleBtn() {

        driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
        this.BtnAddOwnerPage.isDisplayed();
    }

    public void ClickBtnAddOwner() {

        this.BtnAddOwnerPage.click();
    }

    public void CreateOwnerFirstname() {

        this.insertFirstname.sendKeys("Julien");
    }

    public void CreateOwnerName() {

        this.insertLastname.sendKeys("dufour");
    }

    public void CreateOwnerAddress() {

        this.insertAddress.sendKeys("18 rue des bergers");
    }

    public void CreateOwnerCity() {

        this.insertCity.sendKeys("Lille");
    }

    public void CreateOwnerTel() {

        this.insertTelephone.sendKeys("0321458741");
    }

    public void OwnerBtnConfirm() {

        this.BtnAddOwnerValidate.click();
    }
}
