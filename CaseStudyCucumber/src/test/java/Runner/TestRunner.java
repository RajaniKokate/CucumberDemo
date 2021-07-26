package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/login/casestudy.feature"},
glue={"StepDefination"},
plugin = {
		  "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
		  "junit:target/junit-report.xml", "testng:target/testng-output.xml" },
monochrome = true
)
public class TestRunner {

}
