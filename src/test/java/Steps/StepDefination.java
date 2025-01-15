package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

public class StepDefination extends Base{

    @Given("I am on the Landing page")
    public void i_am_on_the_landing_page() {

    }
    @And("I click on Formula1")
    public void i_click_on_formula1()
    {
        landingPage.clickFormula1Link();

    }

    @Given("I click on Results")
    public void i_click_on_results()
    {
        landingPage.clickResultsLink();
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
