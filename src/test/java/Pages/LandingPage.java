package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[@class='ssrcss-1u47p8g-LinkTextContainer eis6szr1'][normalize-space()='Formula 1']")
    WebElement formula1_xpath;

    @FindBy(xpath = "//span[contains(.,'Results')]")
    WebElement results_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFormula1Link() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(formula1_xpath));
        formula1_xpath.click();
    }

    public void clickResultsLink() {
        results_xpath.click();
    }


}


