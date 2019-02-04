package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\Features",
glue= {"D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\src\\main\\java\\stepDefinition"},
format= {"pretty","html:test:output"})
public class Runner {

	
}
