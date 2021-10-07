package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    /*public static final WebDriver driver = new ChromeDriver();*/

    protected WebDriver driver;

    public GlobalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

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

    public boolean isTextPresent(String texte) {
        return driver.getPageSource().contains(texte);
    }
}
