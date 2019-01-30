package com.maven.test.com.maven.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MavenClass {
	WebDriver driver;
	@Test
	@Parameters("browsername")
	private void browser(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("www.google.com/");
			driver.quit();
		}
		else if (name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.maven.practice\\chromedriver.exe");
			driver.get("www.google.com/");
			driver.quit();
		}
	}
	/*@Test(groups= {"pk"})
	private void run0() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test
	private void nut() {
		System.out.println("kumar prasanna");
	}
	@Test(groups= {"pk","kp"})
	private void run1() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(groups= {"pk","pkp"})
	private void run2() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(invocationCount= 10)
	private void run3() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(invocationCount= 10)
	private void run4() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}*/
	

}
