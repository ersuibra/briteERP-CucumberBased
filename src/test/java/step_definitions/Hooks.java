package step_definitions;

import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }



    @After
    public void tearDown(Scenario scenario) {
        // I want to take screenshot when current scenario fails.
        // scenario.isFailed()  --> tells if the scenario failed or not
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }
        //Driver.closeDriver();
    }
}
