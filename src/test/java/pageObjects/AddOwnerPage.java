package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    public void VisibleBtn(String arg0) {

        driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
        this.BtnAddOwnerPage.isDisplayed();
    }

    public void ClickBtnAddOwner(String arg0) {

        this.BtnAddOwnerPage.click();
    }

    public void inputForm(String name, String value) {

        this.insertFirstname.sendKeys("jeremy");
        this.insertLastname.sendKeys("dufour");
        this.insertAddress.sendKeys("rue du pere noel");
        this.insertCity.sendKeys("henin beaumont");
        this.insertTelephone.sendKeys("0303030303");
    }

    public void OwnerBtnConfirm(String arg0) {

        this.BtnAddOwnerValidate.click();
    }

    public void inputFormOutline(String arg0, String arg1, String arg2, String arg3, String arg4) {
        this.insertFirstname.sendKeys(arg0);
        this.insertLastname.sendKeys(arg1);
        this.insertAddress.sendKeys(arg2);
        this.insertCity.sendKeys(arg3);
        this.insertTelephone.sendKeys(arg4);
    }
}
