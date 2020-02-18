package runner.totaljobs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = "stepDef.Totaljobs",
		tags = {"@clickSearch"},
		plugin = {"pretty" , "html:target/cucumber-reports","json:target/cucumber.json"}
		
		)

public class SearchJobsRunner {

}
