package Testselenium;

import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class auto1 
{
	auto1()
	{
		System.out.println("Contr");
	}
	WebDriver driver = new ChromeDriver();


	public void auto()
	{

		try {
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.get("http://vuhgqa01a.ct.com/exemplar/user/LoginEdit.action;jsessionid=nwyz3nq1gASo+uVoHuLMP26v.wa03_qa01#4");
			/*TakesScreenshot ts = (TakesScreenshot)driver;
			driver.navigate().to("https://outlook.office.com/owa/?realm=emids.com&exsvurl=1&ll-cc=2057&modurl=0");
			Thread.sleep(5000);
			driver.navigate().back();*/

			driver.findElement(By.id("LoginEdit_username")).sendKeys("sallysales");
			driver.findElement(By.id("LoginEdit_password")).sendKeys("Password1");
			driver.findElement(By.id("LoginEdit_login_button")).click();
			driver.findElement(By.xpath("//a[@href='NavCleanup.action?nextAction=/group/GroupSearch.action?advSearch=true']")).click();

			JavascriptExecutor je = (JavascriptExecutor)driver;
			WebElement element=driver.findElement(By.id("activitySearch"));
			Thread.sleep(2000);
			//making the web page move
			je.executeScript("arguments[0].scrollIntoView(true)", element);

			Thread.sleep(2000);
			element.click();
			WebElement ele2= driver.findElement(By.id("select5"));
			//ele2.click();
			Select rnew = new Select(ele2);
			Thread.sleep(2000);
			rnew.selectByVisibleText("Renewals (SG)");
			Thread.sleep(2000);

			/*Robot R = new Robot();
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_P);*/
			/*org.openqa.selenium.Point p = ele2.getLocation();
			int x = p.getX();
			int y = p.getY();
			Actions act = new Actions(driver);
			act.moveToElement(ele2, x, y);*/
			driver.findElement(By.xpath("//button[@id='GroupSearch_2']")).click();
			/*je.executeScript("argument[0].scrollIntoView(true)", search2);
			System.out.println("guru");*/
			driver.close();

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) 
	{
		auto1 pk = new auto1();
		pk.auto();

	}
}
