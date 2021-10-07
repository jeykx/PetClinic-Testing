package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

   /** public WebDriver driver;

    public static void setUp() {
        /*System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://spring-petclinic-community.herokuapp.com/");
        driver.quit();
        }
    }*/

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

    public static WebDriver initBrowser(String myBrowser, WebDriver driver, String headless) {
        if (myBrowser == null) {
            myBrowser = Browser.CHROME.browserDescription;
        }
        String myUrl = System.getProperty("base.url");
        if (myUrl == null) {
            myUrl = "https://spring-petclinic-community.herokuapp.com/";
        }
        if (Browser.CHROME.browserDescription.equalsIgnoreCase(myBrowser)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            if (Boolean.parseBoolean(headless)) {
                chromeOptions.addArguments("--headless");
            }
            chromeOptions.addArguments("--ignore-certificate-errors");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        }
        if (Browser.FIREFOX.browserDescription.equalsIgnoreCase(myBrowser)) {
            FirefoxOptions options = new FirefoxOptions();
            if (Boolean.parseBoolean(headless)) {
                options.addArguments("--headless");
            }
            options.addArguments("--ignore-certificate-errors");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(myUrl);
        return driver;
    }

}
