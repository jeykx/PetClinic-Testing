package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VeterinariansPage extends GlobalPage {

    /*public WebDriver driver = new ChromeDriver();*/


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Veterinarians')]")
    private WebElement LinkVet;

    public VeterinariansPage(WebDriver driver) { super(driver);
    }


    public void ClickVeto() {
        driver.get("https://spring-petclinic-community.herokuapp.com/");
        this.LinkVet.click();
    }
}
