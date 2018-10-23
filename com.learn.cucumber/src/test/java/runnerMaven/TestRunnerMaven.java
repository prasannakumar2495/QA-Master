package runnerMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeaturesMaven"},glue= {"stepDefinitionMaven"},
plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"})
public class TestRunnerMaven 
{

}
