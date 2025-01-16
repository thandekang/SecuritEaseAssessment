package Steps;

import Helpers.BrowserFactory;
import Pages.LandingPage;
import Pages.SportPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.bbc.com/sport");
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    SportPage sportPage = PageFactory.initElements(driver, SportPage.class);

}
