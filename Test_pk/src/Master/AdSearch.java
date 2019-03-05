package Master;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AdSearch {
	WebDriver driver;
	@Test(priority=0)
	public void f() {
		try {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", ".\\chromer.exe");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://uhgatlsgqa04.ct.com:8180/exemplar/user/LoginEdit.action#4");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sallysales");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password1");
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.xpath("//a[text()='Advanced Search ']")).click();
			//scrolling until SEARCH button
			driver.findElement(By.xpath("//span[@class='fa fa-search']"));
			System.out.println("scrolled until Search button");
			WebDriverWait wait=new WebDriverWait(driver, 20);
			//clicking on activity criteria
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='activitySearch'][@name='activitySearch'])[1]"))).click();
			WebElement dropdown=driver.findElement(By.xpath("//select[@name='selectedActivity']"));
			Select sel = new Select(dropdown);
			sel.selectByVisibleText("Renewals (SG)");
			WebElement status=driver.findElement(By.xpath("//select[@name='selectRenewal']"));
			Select sel1 = new Select(status);
			sel1.selectByVisibleText("Ready");
			driver.findElement(By.xpath("//span[@class='fa fa-search']"));
			WebElement renwalPeriod=driver.findElement(By.xpath("//select[@id='GroupSearch_renewalPeriod']"));
			Select sel2 = new Select(renwalPeriod);
			//selecting the last dropDown
			List<WebElement> last = sel2.getOptions();
			last.get(last.size()-1).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='fa fa-search']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='GroupSearchResult_4']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@name='quotes']"))).click();
			//scrolling until bottom
			driver.findElement(By.xpath("//div[@class='footer-line3']"));
			//driver.findElement(By.xpath("//button[@id='SGQuotesActivities_copy_quote_button']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'RNQ')]/../td[12]"))).click();
			System.out.println("clicked on copy of RNQ");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='renewalsQuotes']/tbody/tr[1]/td[11]"))).click();
			System.out.println("clicked on the view of RNA");
			Thread.sleep(2000);
			
			
			////table[@id='renewalsQuotes']/tbody/tr[1]/td[11]
			////td[contains(text(),'RNQ')]/../td[12]

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test(priority=1,alwaysRun=true)
	public void alwaysrun()
	{
		driver.quit();
	}
}
