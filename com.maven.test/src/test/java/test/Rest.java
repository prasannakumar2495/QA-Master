package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

//import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Rest {
	WebDriver driver;
	@Test(priority=0)
	@Parameters("browsername")
	private void browser(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			
		}
		else if (name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.maven.test\\chromedriver.exe");
			//ChromeDriverManager.getInstance().setup();
		}
		else if (name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			//System.setProperty("webdriver.firefox.driver","D:\\GIT\\QA-Master\\com.maven.test\\geckodriver.exe");
		}
		else if (name.equalsIgnoreCase("html")) {
			driver = new HtmlUnitDriver();
		}
	}
	@Test(priority=1)
	private void navigationbrowser() {
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
