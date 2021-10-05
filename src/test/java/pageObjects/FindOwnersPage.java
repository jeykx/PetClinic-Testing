package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindOwnersPage extends GlobalPage {

    public WebDriver driver = new ChromeDriver();

    public FindOwnersPage(WebDriver driver) {super(driver);}

    @FindBy(how = How.XPATH, using = "//body/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    private WebElement linkOwners;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Owner')]")
    private WebElement btnFindOwner;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement insertLastname;



        public void ClickLinkOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/");
            this.linkOwners.click();
        }

        public void ClickFindOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
            this.btnFindOwner.click();
        }

        public void SearchOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
            this.insertLastname.sendKeys("Franklin");
        }

        public void SearchClickOwner() {

            this.btnFindOwner.click();
        }
}
