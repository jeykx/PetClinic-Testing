package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public WebDriver driver = new ChromeDriver();

     public static By ClickUrlBy = By.xpath("//*[@id=\"L2AGLb\"]/div");
     public static By HomePicture = By.xpath("/html/body/div/div/div[1]/div/img");


    public void WebConnexion() {

        driver.get("https://spring-petclinic-community.herokuapp.com/");
        driver.findElement(HomePicture).isDisplayed();

    }
}
