package runner;


import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(glue = {"cucumberSteps", "runner"},
        plugin = {"html:target/cucumber-html-report", "junit:target/cucumber-junit.xml", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json"},
        features = "src/test/features",
        strict = true,
        monochrome = true,
        tags = "@toptest")

public class RunCukesTest {

    @Test(description = "Example of using TestNGCucumberRunner to invoke Cucumber")
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }

}
