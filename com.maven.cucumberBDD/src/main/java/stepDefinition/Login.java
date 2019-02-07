package stepDefinition;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Login {
	WebDriver driver;
	Navigation nav;
	@Given("^the user has arrived on the gmail webpage$")
	public void the_user_has_arrived_on_the_gmail_webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    throw new PendingException();
	}

	@When("^the title of the current page is gmail$")
	public void the_title_of_the_current_page_is_gmail() throws Throwable {
	    String URL=driver.getCurrentUrl();
	    String Title = driver.getTitle();
	    System.out.println("the current url is: "+ URL);
	    System.out.println("the title of the page is: "+ Title);
	    throw new PendingException();
	}

	@Then("^the user enters the username and the password$")
	public void the_user_enters_the_username_and_the_password() throws Throwable {
	   driver.navigate().refresh();
	    throw new PendingException();
	}

	@Then("^the user clicks on the login button\\.$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
	    driver.quit();
	    throw new PendingException();
	}

}
  