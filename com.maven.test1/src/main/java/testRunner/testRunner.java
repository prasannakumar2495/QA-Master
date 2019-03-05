package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\GIT\\QA-Master\\com.maven.test1\\Features",
glue= {"stepDefinition"},
format= {"pretty","html:target"})
public class testRunner {

}
