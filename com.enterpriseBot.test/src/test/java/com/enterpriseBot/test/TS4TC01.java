package com.enterpriseBot.test;

import java.awt.Container;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

public class TS4TC01 {
	WebDriver driver;
	List<WebElement> options;
	WebDriverWait wait;

	@Test(priority = 0)
	private void dashboard() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.enterpriseBot.test\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo-chatbot2go.enterprisebot.co/signin");
		driver.findElement(By.xpath("//input[@name='usr']")).sendKeys("suraj+tester@enterprisebot.org");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("E13_Tester");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search-form\"]"));
		searchBar.sendKeys("best");
		searchBar.sendKeys(Keys.ENTER);
		WebElement clicksearchvalue = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='work-area intent-list-div']/div/ul/li/span")));
		Thread.sleep(3000);
		clicksearchvalue.click();
		Thread.sleep(5000);

		String data = "prasanna kumar FINAL";
		WebElement AddTrigger = driver.findElement(By.xpath("//input[@placeholder='Add triggers']"));
		AddTrigger.sendKeys(data);
		AddTrigger.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement SAVE = driver
				.findElement(By.xpath("//button[@class='btn btn-success agent-save-button'][@id='intent-save-btn']"));
		SAVE.click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Search triggers...']")).sendKeys("prasanna kumar FINAL");
		Thread.sleep(3000);
		try {
			options = driver.findElements(By.xpath(
					"//ul[@class='trigger-list-group col-lg-12 col-md-12 col-sm-12']//li/descendant::div[@placeholder='Add triggers']"));
		} catch (Exception e) {
			System.out.println("there are no search results for the entered data");
		}
		
		for(WebElement result:options)
		{
			System.out.println(result.getText());
			if (data.equalsIgnoreCase(result.getText())) {
				System.out.println("the entered data did  match");
			} 
		}
		
		driver.quit();
	}
}
