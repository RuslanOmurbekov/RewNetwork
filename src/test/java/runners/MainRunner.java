package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@search",
		features= {"./src/test/resources/features"},
		glue="steps",
		dryRun=false 
)
public class MainRunner extends AbstractTestNGCucumberTests{

}
