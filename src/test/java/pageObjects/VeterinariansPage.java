package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VeterinariansPage extends GlobalPage {

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Veterinarians')]")
    private WebElement titleVetPageVerify;


    public VeterinariansPage(WebDriver driver) { super(driver);}


    public boolean veterinariansPageVerify() {

        WebElement Verify = this.titleVetPageVerify;

        return true;
    }
}
