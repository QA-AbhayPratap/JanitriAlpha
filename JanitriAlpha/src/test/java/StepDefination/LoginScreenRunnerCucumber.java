package StepDefination;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		features = "src/test/resources/Feature/LoginScreenElement.feature",
		glue = "StepDefination", // Path to step definitions
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = true // Makes the console output readable
		)
public class LoginScreenRunnerCucumber extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    } 
	
	

}
