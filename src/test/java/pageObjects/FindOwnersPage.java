package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FindOwnersPage extends GlobalPage {

    public WebDriver driver = new ChromeDriver();

    public FindOwnersPage(WebDriver driver) {super(driver);}



        public void ClickLinkOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/");
            driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a")).click();
        }

        public void ClickFindOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
            driver.findElement(By.cssSelector("div.container-fluid:nth-child(2) div.container.xd-container form.form-horizontal:nth-child(2) div.form-group:nth-child(2) div.col-sm-offset-2.col-sm-10 > button.btn.btn-default")).click();
        }

        public void SearchOwner() {
            driver.get("https://spring-petclinic-community.herokuapp.com/owners/find");
            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Franklin");
        }

        public void SearchClickOwner() {
            driver.findElement(By.cssSelector("div.container-fluid:nth-child(2) div.container.xd-container form.form-horizontal:nth-child(2) div.form-group:nth-child(2) div.col-sm-offset-2.col-sm-10 > button.btn.btn-default")).click();
        }
}
