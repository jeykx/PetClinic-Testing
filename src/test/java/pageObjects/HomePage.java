package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends GlobalPage {

    public HomePage(WebDriver driver) {super(driver);}


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Welcome')]")
    private WebElement verifTitleVisible;



    public boolean homePageVerify() {

        this.verifTitleVisible.isDisplayed();

        return true;
    }
}
