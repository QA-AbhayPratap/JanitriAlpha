package stepDefinition;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/Feature", 
		glue = { "stepDefinition" }, 
		plugin = { "pretty","html:target/HtmlReports" }, // Report generation
		monochrome = true
		)

public class TestRunner {

}
