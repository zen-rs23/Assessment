package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"stepdefinitions"} , 
					plugin = {"pretty" , "html:target/cucumber-html-report", "json:target/cucumber-json-report/report.json",
							"junit:target/cucumber-sml-report/report.xml" } )

public class TestRunner 
{

}
