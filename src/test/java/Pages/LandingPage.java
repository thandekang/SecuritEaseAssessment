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
    WebElement Formula1_xpath;

    @FindBy(xpath = "//span[contains(.,'Results')]")
    WebElement Results_xpath;

    @FindBy(xpath = "//div[@data-content='2023']")
    WebElement Yr2023_xpath;

    @FindBy(xpath = "//span[@data-js-text='true'][contains(.,'Las Vegas Grand Prix, Las Vegas Street Circuit')]")
    WebElement LasVegasResults_xpath;

    @FindBy(xpath = "(//span[@class='signpost-link-text-wrapper'][contains(.,'Full race results')])[2]")
    WebElement FullRaceResultsLink_xpath;




    @FindBy(xpath = "//*[@id=\"main-heading\"]")
    WebElement LasVegasResultsPageHeading_xpath;

    @FindBy(xpath = "(//span[contains(.,'Max Verstappen')])[5]")
    WebElement FirstFinisher_xpath;

    @FindBy(xpath = "(//span[contains(.,'Charles Leclerc')])[5]")
    WebElement SecondFinisher_xpath;

    @FindBy(xpath = "(//span[contains(.,'Sergio Perez')])[1]")
    WebElement ThirdFinisher_xpath;


    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickFormula1Link() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(Formula1_xpath));
        Formula1_xpath.click();
    }

    public void clickResultsLink()
    {
        Results_xpath.click();
    }

    public void clickYear2023Link()
    {
        Yr2023_xpath.click();
    }

    public void clickLasVegasResultsHeading()
    {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(LasVegasResults_xpath));

        LasVegasResults_xpath.click();

    }


    public void viewFullRaceResults(){

        FullRaceResultsLink_xpath.click();
    }

    public void verifyLasVegasResultsPage()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LasVegasResultsPageHeading_xpath));
        LasVegasResultsPageHeading_xpath.isDisplayed();
        String ResultsHeadingText = LasVegasResultsPageHeading_xpath.getText();
        Assert.assertEquals(ResultsHeadingText,"2023 Las Vegas Grand Prix");
    }


    public void verifyMaxVerstappenFinishedFirst()
    {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstFinisher_xpath));
        FirstFinisher_xpath.isDisplayed();
        String FirstFinisherText = FirstFinisher_xpath.getText();
        Assert.assertEquals(FirstFinisherText,"Max Verstappen");
    }


    public void verifyGeorgeRussellFinishedSecond()
    {

        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SecondFinisher_xpath));
        SecondFinisher_xpath.isDisplayed();
        String SecondFinisherText = SecondFinisher_xpath.getText();
        Assert.assertEquals(SecondFinisherText,"George Russell");


    }

    public void verifySergioPerezFinishedThird()
    {

        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ThirdFinisher_xpath));
        ThirdFinisher_xpath.isDisplayed();
        String ThirdFinisherText = ThirdFinisher_xpath.getText();
        Assert.assertEquals(ThirdFinisherText,"Sergio Perez");


    }







}


