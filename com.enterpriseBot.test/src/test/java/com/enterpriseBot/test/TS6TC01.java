package com.enterpriseBot.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TS6TC01 {
	WebDriver driver;
	List<WebElement> options;
	WebDriverWait wait;
	JavascriptExecutor jse;
	@Test(priority = 0)
	private void dashboard() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.enterpriseBot.test\\chromedriver.exe");
		driver = new ChromeDriver();
		jse = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo-chatbot2go.enterprisebot.co/signin");
		driver.findElement(By.xpath("//input[@name='usr']")).sendKeys("suraj+tester@enterprisebot.org");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("E13_Tester");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='left-menu']/ul/li[2]")).click();
		Thread.sleep(3000);
		WebElement createEntity = driver.findElement(By.xpath("//div[@class='create-header']/button"));
		createEntity.click();
		Thread.sleep(3000);
		String data = "prasanna kumar";
		WebElement entityName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class ='details-wrapper']/div/div/input")));
		entityName.sendKeys(data);
		Thread.sleep(3000);
		WebElement referenceValue = driver.findElement(By.xpath("//div[@class='entity-list-wrapper']/ul/li/div/div/div/input"));
		referenceValue.sendKeys("meaning");
	//	WebElement synonymValue = driver.findElement(By.xpath("//*[@id=\"add-synonym0\"]"));
		jse.executeScript("document.getElementById('add-synonym0\'.value='synonym';)");
		//synonymValue.sendKeys("synonym");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		driver.quit();
	}

}