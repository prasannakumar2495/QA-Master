package stepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Login {
	String first_name;
	String last_name;
	int phone_number;
	String email;
	WebDriver driver;
	
	@Given("^the user has arrived on the gmail webpage$")
	public void the_user_has_arrived_on_the_gmail_webpage()  {
		first_name= "prasanna";
		System.out.println(first_name);
		System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@When("^the title of the current page is gmail$")
	public void the_title_of_the_current_page_is_gmail()  {
		last_name="kumar";
		System.out.println(last_name);
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/9049995/java-poi-how-to-find-an-excel-cell-with-a-string-value-and-get-its-position-ro");
	}

	@Then("^the user enters the username and the password$")
	public void the_user_enters_the_username_and_the_password()  {
		phone_number=654165456;
		System.out.println(phone_number);
		String URL=driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(URL);
		System.out.println(Title);
	}

	@Then("^the user clicks on the login button\\.$")
	public void the_user_clicks_on_the_login_button() {
		email ="sdjfbsdkhfg@kjfbk.com";
		System.out.println(email);
		driver.quit();
	}
	
	@Given("^the user has arrived on the gmail$")
	public void the_user_has_arrived_on_the_gmail() {
		first_name= "prasanna";
		System.out.println(first_name);
		System.setProperty("webdriver.chrome.driver", "D:\\GIT\\QA-Master\\com.maven.cucumberBDD\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^the title of the current page is$")
	public void the_title_of_the_current_page_is()  {
		last_name="kumar";
		System.out.println(last_name);
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/9049995/java-poi-how-to-find-an-excel-cell-with-a-string-value-and-get-its-position-ro");
	
	}

	@Then("^the user enters the username and the$")
	public void the_user_enters_the_username_and_the()  {
		phone_number=654165456;
		System.out.println(phone_number);
		String URL=driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(URL);
		System.out.println(Title);
	}

	@Then("^the user clicks on  login button\\.$")
	public void the_user_clicks_on_login_button(){
		email ="sdjfbsdkhfg@kjfbk.com";
		System.out.println(email);
		driver.quit();
	}

}
  