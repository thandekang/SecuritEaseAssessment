package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LandingPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[@class='ssrcss-1u47p8g-LinkTextContainer eis6szr1'][normalize-space()='Formula 1']")
    WebElement formula1_xpath;

    @FindBy(xpath = "//span[contains(.,'Results')]")
    WebElement results_xpath;

    @FindBy(xpath = "//div[@data-content='2023']")
    WebElement Yr2023_xpath;

    @FindBy(xpath = "//span[@data-js-text='true'][contains(.,'Las Vegas Grand Prix, Las Vegas Street Circuit')]")
    WebElement lasVegasResults_xpath;

    @FindBy(xpath = "(//span[@class='signpost-link-text-wrapper'][contains(.,'Full race results')])[2]")
    WebElement fullracelink_xpath;

    @FindBy(xpath = "//*[@id=\"main-heading\"]")
    WebElement LasVegasResultsPageHeading_xpath;

    @FindBy(xpath = "(//span[@class='ssrcss-1hf3wfc-FullName e1dzfgvv0'][contains(.,'Max Verstappen')])[5]")
    WebElement firstdriver_xpath;


    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickFormula1Link() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(formula1_xpath));
        formula1_xpath.click();
    }

    public void clickResultsLink()
    {
        results_xpath.click();
    }

    public void clickYear2023Link()
    {
        Yr2023_xpath.click();
    }

    public void clickLasVegasResultsHeading()
    {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(lasVegasResults_xpath));

        lasVegasResults_xpath.click();

    }


    public void viewFullRaceResults(){

        fullracelink_xpath.click();
    }

    public void verifyLasVegasResultsPage()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LasVegasResultsPageHeading_xpath));
        LasVegasResultsPageHeading_xpath.isDisplayed();
        String ResultsHeadingText = LasVegasResultsPageHeading_xpath.getText();
        Assert.assertEquals(ResultsHeadingText,"2023 Las Vegas Grand Prix");
    }




}


