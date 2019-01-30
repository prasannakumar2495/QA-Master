package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Rest {
	WebDriver driver;
	@Test
	@Parameters("browsername")
	private void browser(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			driver.get("www.google.com/");
			driver.quit();
		}
		else if (name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", "");
			ChromeDriverManager.getInstance().setup();
			driver.get("www.google.com/");
			driver.quit();
		}
	}

}
