package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver driver;


    public static WebDriver startBrowser(String browserChoice, String url) {
        if ("chrome".equalsIgnoreCase(browserChoice)) {
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if ("firefox".equalsIgnoreCase(browserChoice)) {
            driver = new FirefoxDriver();
        } else if ("edge".equalsIgnoreCase(browserChoice)) {
            driver = new EdgeDriver();
        } else
        {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}


