package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SportPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Search BBC')]")
    WebElement searchLink_xpath;

    @FindBy(xpath = "//input[@id='searchInput']")
    WebElement searchInput_xpath;

    @FindBy(xpath = "//button[@id='searchButton']")
    WebElement searchBtn_xpath;

    @FindBy(xpath = "(//a[@class='ssrcss-its5xf-PromoLink exn3ah91'])[1]")
    WebElement resultsOutCome_xpath;

    public SportPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public void clickSearchLink(){
        searchLink_xpath.click();
    }

    public void enterSearchInput(String searchinput) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchInput_xpath));
            searchInput_xpath.sendKeys(searchinput);
        }
        catch (Exception e)
        {

            System.out.println("An error occured while entering the search input:" + e.getMessage());

        }


    }

    public void clickSearchBtn()
    {
        searchBtn_xpath.click();
    }

    public void verifyResultsAreDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(resultsOutCome_xpath));
        resultsOutCome_xpath.isDisplayed();
    }

    public void verifySportsIn2023AreDisplayed() {


        int numberOfResults = 0; // number of articles with sport in 2023
        int x = 0; //array index increment

        for (int i = 1; i <= 30; i += 3) {

            x = i + 1;
            String articleDetailsDateTextXpath = "(//span[@class='ssrcss-1if1g9v-MetadataText e4wm5bw1'][contains(.,*)])[" + i + "]"; // Date of article
            String articleDetailsTypeTextXpath = "(//span[@class='ssrcss-1if1g9v-MetadataText e4wm5bw1'][contains(.,*)])[" + x + "]"; // article type


            WebElement articleDetailsDateTextXpathElement = driver.findElement(By.xpath(articleDetailsDateTextXpath));
            WebElement articleDetailsTypeTextXpathElement = driver.findElement(By.xpath(articleDetailsTypeTextXpath));


            String articleDetailsDateText = articleDetailsDateTextXpathElement.getText().toLowerCase();
            String articleDetailsTypeText = articleDetailsTypeTextXpathElement.getText().toLowerCase();


            if (articleDetailsTypeText.contains("sport") && articleDetailsDateText.contains("2023")) {
                numberOfResults++;  // Increment the count if the text contains "sport in 2023
            }
            // Exit the loop when the results are equal to 4
            if (numberOfResults == 4) {
                break;
            }
        }

        Assert.assertEquals(numberOfResults,  4, "Expected to find 4 results with 'sport in 2023', but found " + numberOfResults);
    }


}
