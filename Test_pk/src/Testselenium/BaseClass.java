package Testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public  void main(String[] args) 
	{
	System.setProperty("webdriver.driver.chromedriver",".\\chromedriver");
	WebDriver driver = new ChromeDriver();
	}
}