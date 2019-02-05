package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/prasannakumaranisetti/Movies/GIT/QA-Master/com.maven.cucumberBDD/Features/login.feature",
glue= {"/Users/prasannakumaranisetti/Movies/GIT/QA-Master/com.maven.cucumberBDD/src/main/java/stepDefinition/Login.java"})
//format= {"pretty","html:test:output"}

public class Runner {

	
}
