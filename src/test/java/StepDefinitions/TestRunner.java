package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", glue= {"StepDefinitions"},
		monochrome = true,
		//plugin = {"pretty", "html:target/HtmlReports"}
		//plugin = {"pretty", "json:target/JSONReports/report.json"}
		plugin = {"pretty", "junit:target/JUnitReports/report.xml"},
		tags="@smoketest"
)
public class TestRunner {

}
