package stepDefinitionMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepMaven 
{
	WebDriver driver;
	@Given("^open the  chrome browser and enter the url$")
	public void open_the_chrome_browser_and_enter_the_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//prasannakumaranisetti//Movies//WS//testCucumber//chromedriver");
		driver = new ChromeDriver();
		//driver = new HtmlUnitDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println("given is done");

	}

	@When("^enter the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_valid_credentials_and(String uname, String pass) throws Throwable {
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		System.out.println("when is done");


	}

	@Then("^user should be able to login sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.quit();
		System.out.println("then is done");
	}


}
