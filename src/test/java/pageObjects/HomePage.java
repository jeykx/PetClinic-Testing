package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends GlobalPage {

    public HomePage(WebDriver driver) {super(driver);}


     @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/div[1]/div[1]/img[1]")
     private WebElement HomePictureVerify;



    public void WebConnexion() {

        driver.get("https://spring-petclinic-community.herokuapp.com/");
        this.HomePictureVerify.isDisplayed();

    }
}
