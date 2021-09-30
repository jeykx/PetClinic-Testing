package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

    public WebDriver driver;

    public static enum Browser {
        FIREFOX("FIREFOX"), CHROME("CHROME");
        private final String browserDescription;
        private Browser(String value) {
            browserDescription = value;
        }
        public String value() {
            return browserDescription;
        }
    }

    public static WebDriver initBrowser(String myBrowser, WebDriver driver) {
        if (myBrowser == null) {
            myBrowser = Browser.FIREFOX.browserDescription;
        }
        String myUrl = System.getProperty("base.url");
        if (myUrl == null) {
            myUrl = "https://spring-petclinic-community.herokuapp.com/";
        }
        if (Browser.CHROME.browserDescription.equalsIgnoreCase(myBrowser)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--ignore-certificate-errors");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            driver = new ChromeDriver(chromeOptions);
        }
        if (Browser.FIREFOX.browserDescription.equalsIgnoreCase(myBrowser)) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            options.addArguments("--ignore-certificate-errors");
            driver = new FirefoxDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(myUrl);
        return driver;
    }
}
