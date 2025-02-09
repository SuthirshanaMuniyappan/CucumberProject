package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features ={"src/test/resources/features/"},
		glue = {"stepDef", "hooks"},
	    tags = "@All_scenario", 
		plugin = {"pretty", "json:target/cucumber.json", 
							"html:target/cucumber.html"},
		dryRun = true
		) 
public class TestRunnerClass extends AbstractTestNGCucumberTests{
	
	
	
}
