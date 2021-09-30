package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class conf {
    private String baseUrl;

    public void setUp() throws Exception {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://spring-petclinic-community.herokuapp.com/";
    }
}
