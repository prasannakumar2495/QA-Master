package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage 
{
	WebDriver driver;
	public MainPage()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver.get("https://www.amazon.in/");
	
	}
	public void method1()
	{
		driver.findElement(By.xpath("//img(@href='/b/ref=IN-PR-Oct18-ART-W2-PC-Default?node=3419926031&pf_rd_p=8fdb7f7b-046e-41fa-88ed-3b57bc988d2e&pf_rd_r=1Y7MYJ8JMMM70JK68QX9')"));
		driver.quit();
	}
	public static void main(String[] args) {
		MainPage mp = new MainPage();
		mp.method1();
	}
}
