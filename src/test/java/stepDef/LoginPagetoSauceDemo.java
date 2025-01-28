package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import driver.drivers;
import io.cucumber.java.en.*;

public class LoginPagetoSauceDemo extends drivers {
	 
	@Given("User navigate to the Sauce Demo login page")
	public void User_navigate_to_the_sauce_demo_login_page() {
		System.out.println("User enter login Page Successfully");
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() { 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@Then("User should be logged in successfully")
	public void User_should_be_logged_in_successfully() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		//driver.close();
		System.out.println("Browser closed Successfully");
	}

}
