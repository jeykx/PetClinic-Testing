package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OwnerInformationPage extends GlobalPage {

    public OwnerInformationPage(WebDriver driver) {super(driver);}

    public void UrlOwner() {
        driver.get("https://spring-petclinic-community.herokuapp.com/owners/11");
    }

    public void AddNewPetBtn() {
        driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
    }

    public void NamePet() {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Mosquito");
    }

    public void BirthDatePet() {
        driver.findElement(By.id("birthDate")).sendKeys("2014-12-15");
    }

    public void TypePet() {
        new Select(driver.findElement(By.id("type"))).selectByVisibleText("dog");
    }

    public void BtnAddPetValidate() {
        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button")).click();
    }

}
