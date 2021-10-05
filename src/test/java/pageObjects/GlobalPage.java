package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GlobalPage {


    public static final WebDriver driver = new ChromeDriver();

    public GlobalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isTextPresent(String texte) {
        return driver.getPageSource().contains(texte);
    }
}
