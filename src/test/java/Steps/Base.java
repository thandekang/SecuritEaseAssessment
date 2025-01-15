package Steps;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.bbc.com/sport");
}
