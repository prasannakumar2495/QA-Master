package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rest {
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

}
