package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SportPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Search BBC')]")
    WebElement searchLink_xpath;

    @FindBy(xpath = "//input[@id='searchInput']")
    WebElement searchInput_xpath;

    @FindBy(xpath = "//button[@id='searchButton']")
    WebElement searchBtn_xpath;

    public SportPage(WebDriver driver)
    {
        this.driver = driver;
    }





    public void clickSearchLink(){
        searchLink_xpath.click();
    }

    public void enterSearchInput(String searchinput)
    {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(searchInput_xpath));
        searchInput_xpath.sendKeys(searchinput);


    }

    public void clickSearchBtn()
    {
        searchBtn_xpath.click();
    }


}
