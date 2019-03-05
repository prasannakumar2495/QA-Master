package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Words {
	WebDriver driver;
	@Test(priority=1)
	public void wordseparately()
	{
		try {
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://uhgatlsgqa04.ct.com:8180/exemplar/user/LoginEdit.action#4");
			String strng = driver.findElement(By.xpath("//div[text()='Welcome!! Meeting your insurance needs has never been so easy.']")).getText();
			String s = new String(strng);
			String[] str = s.split(" ");
			System.out.println(str[2]);
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=2,alwaysRun=true)
	public void run()
	{
		driver.quit();
	}


}
