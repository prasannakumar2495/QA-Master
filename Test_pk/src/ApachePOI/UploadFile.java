package ApachePOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile
{
	WebDriver driver;
	public void loadfile()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		WebElement upload=driver.findElement(By.xpath("//input[@class='c-6c5727f6-d367-4ded-a424-66750d2d58ee requiredUpload form-control']"));
		upload.sendKeys("D:\\continue and plans error.odt");
	}

}
