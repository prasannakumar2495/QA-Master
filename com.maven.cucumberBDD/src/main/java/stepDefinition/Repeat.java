package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Repeat {
	String first_name;
	String last_name;
	int phone_number;
	String email;
	WebDriver driver;
	
	@Given("^the user$")
	public void the_user()  {
		first_name= "prasanna";
		System.out.println(first_name);
		System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@When("^the title of$")
	public void the_title_of()  {
		last_name="kumar";
		System.out.println(last_name);
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/9049995/java-poi-how-to-find-an-excel-cell-with-a-string-value-and-get-its-position-ro");
	
	}

	@Then("^the user enters$")
	public void the_user_enters()  {
		phone_number=654165456;
		System.out.println(phone_number);
		String URL=driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(URL);
		System.out.println(Title);
	}

	@Then("^the user clicks on$")
	public void the_user_clicks_on() {
		email ="sdjfbsdkhfg@kjfbk.com";
		System.out.println(email);
		driver.quit();
	}


}
