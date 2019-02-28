package com.enterpriseBot.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

public class TS4TC01 {
	WebDriver driver;
	JavascriptExecutor jse;
	@Test(priority=0)
	private void dashboard() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/prasannakumaranisetti/Movies/GIT/QA-Master/com.enterpriseBot.test/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo-chatbot2go.enterprisebot.co/signin");
		driver.findElement(By.xpath("//input[@name='usr']")).sendKeys("suraj+tester@enterprisebot.org");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("E13_Tester");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
		WebElement searchBar=driver.findElement(By.xpath("//*[@id=\"search-form\"]"));
		searchBar.sendKeys("best");
		searchBar.sendKeys(Keys.ENTER);
		WebElement clicksearchvalue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='work-area intent-list-div']/div/ul/li/span")));
		Thread.sleep(10000);
		//jse.executeScript("arguments[0].click();", clicksearchvalue);
		clicksearchvalue.click();
		Thread.sleep(10000);
		String data = "prasanna kumar money5";
		WebElement AddTrigger=driver.findElement(By.xpath("//input[@placeholder='Add triggers']"));
		AddTrigger.sendKeys(data);
		AddTrigger.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='btn btn-success agent-save-button']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@placeholder='Search triggers...']")).sendKeys("prasanna kumar money5");
		String options=driver.findElement(By.xpath("//*[@id=\"trigger-section\"]/div[2]/div[2]/ul/li[1]/div/div")).getText();
		if(data.equalsIgnoreCase(options))
		{
			System.out.println("the entered data did  match");
		}
		else {
			System.out.println("the entered data did not match");

		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/button[2]")).click();
		driver.quit();
	}
}
