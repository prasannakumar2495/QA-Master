package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\Features",
glue= {"stepDefinition"},
format= {"pretty","html:target"})

public class Runner {

	
}
