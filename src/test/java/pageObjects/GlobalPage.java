package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GlobalPage {

    @FindBys(
            @FindBy(how = How.XPATH, using = "//ul/li/a")
    )
    private List<WebElement> lst_menu;

    protected WebDriver driver;

    public GlobalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Owner')]")
    private WebElement btnFindOwner;

    public void clikOnMenuName(String menuName) {
        boolean findMenu = false;
        for (WebElement currentMenu : lst_menu) {
            if (currentMenu.getAttribute("title").equalsIgnoreCase(menuName)) {
                currentMenu.click();
                findMenu = true;
                break;
            }
        }
        Assert.assertTrue("Menu " + menuName + " not present on screen", findMenu);
    }

    public void clickFindOwnerBtn() {

        this.btnFindOwner.click();
    }

    public boolean isTextPresent(String texte) {
        return driver.getPageSource().contains(texte);
    }
}
