package Testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {
	WebDriver driver2 = new ChromeDriver();

	public void auto2()
	{
		try {
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			//for alert pop-up's
			driver2.switchTo().alert().accept();//for accepting the pop-up
			driver2.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
