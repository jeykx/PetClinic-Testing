package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeterinariansPage {

    public WebDriver driver = new ChromeDriver();

    public static By LinkVet = By.xpath("//*[@id=\"main-navbar\"]/ul/li[4]/a");

    public void HomeCheck() {
        driver.get("https://spring-petclinic-community.herokuapp.com/");

    }

    public void ClickVeto() {
        driver.get("https://spring-petclinic-community.herokuapp.com/");
        WebElement link = this.driver.findElement(LinkVet);
        link.click();
    }
}
