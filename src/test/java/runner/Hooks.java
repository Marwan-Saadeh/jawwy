package runner;

import common.PageFactory;
import common.StateHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;


public class Hooks {

    @Before
    public void hookBeforeScenario() {
        System.out.println("custom Before scenario hook");
        PageFactory.instance().deleteAllDriverCookies();
    }

    @After
    public void hookAfterScenario(Scenario scenario) {
        System.out.println("custom After scenario hook");
        try {
            StateHelper.clearStepState();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PageFactory.instance().deleteAllDriverCookies();
        if (scenario.isFailed()) {
            final byte[] screenshot  = ((TakesScreenshot) PageFactory.instance().getWebDriver())
                   .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot , "image/png"); //stick it in the report
        }

    }

}