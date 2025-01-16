package runner;

import io.cucumber.core.snippets.SnippetType;

//import org.junit.runner.RunWith;

//import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources"},
		glue = {"stepDef"},
		tags = "@DeleteSelectedPolicy", 
		
		plugin = {"pretty", "json:target/cucumber.json", 
							"html:target/cucumber.html"},
		dryRun = false
		
		) 
public class TestRunnerClass extends AbstractTestNGCucumberTests{
	
}
