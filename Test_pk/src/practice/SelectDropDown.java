package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	WebDriver driver;
	Select sel;
  @Test
  public void f() {
	  try {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.amazon.in/");
		  WebElement dropdown=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		  sel = new Select(dropdown);
		  sel.selectByVisibleText("Books");
		  Thread.sleep(2000);
		  driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
