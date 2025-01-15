package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class StepDefination extends Base{

    @Given("I am on the Landing page")
    public void i_am_on_the_landing_page() {

    }
    @And("I click on Formula1")
    public void i_click_on_formula1()
    {
        landingPage.clickFormula1Link();

    }

    @And("I click on Results")
    public void i_click_on_results()

    {
        landingPage.clickResultsLink();
    }

    @And("I click {int}")
    public void i_click(Integer int1)
    {
        landingPage.clickYear2023Link();
    }


    @When("I click on LasVegas Grandprix results heading")
    public void i_click_on_las_vegas_grandprix_results_heading()  {

        landingPage.clickLasVegasResultsHeading();
        landingPage.viewFullRaceResults();
    }


    @Then("the LasVegas Grandprix results page is displayed")
    public void the_las_vegas_grandprix_results_page_is_displayed() {

       landingPage.verifyLasVegasResultsPage();


    }




    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }

    @After
    public void tearDown()
        {
            driver.quit();

    }
}
