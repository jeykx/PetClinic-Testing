package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalPage {

    protected WebDriver driver;

    public GlobalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean isTextPresent(String texte) {
        return this.driver.getPageSource().contains(texte);
    }
}
