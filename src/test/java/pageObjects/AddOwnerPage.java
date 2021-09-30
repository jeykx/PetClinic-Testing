package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AddOwnerPage extends GlobalPage {

    public WebDriver driver = new ChromeDriver();

    public AddOwnerPage(WebDriver driver) {super(driver);}

    public void VisibleBtn() {
        driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
        driver.findElement(By.xpath("/html/body/div/div/a")).isDisplayed();
    }

    public void ClickBtnAddOwner() {
        driver.findElement(By.xpath("/html/body/div/div/a")).click();
    }

    public void CreateOwnerFirstname() {
        driver.findElement(By.id("firstName")).sendKeys("Julien");
    }

    public void CreateOwnerName() {
        driver.findElement(By.id("lastName")).sendKeys("Dubois");
    }

    public void CreateOwnerAddress() {
        driver.findElement(By.id("address")).sendKeys("18 rue des bergers");
    }

    public void CreateOwnerCity() {
        driver.findElement(By.id("city")).sendKeys("Lille");
    }

    public void CreateOwnerTel() {
        driver.findElement(By.id("telephone")).sendKeys("0321458741");
    }

    public void OwnerBtnConfirm() {
        driver.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).click();
    }
}
