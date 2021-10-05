package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confUtil {

    public WebDriver driver;

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://spring-petclinic-community.herokuapp.com/");
        driver.quit();
    }
}
