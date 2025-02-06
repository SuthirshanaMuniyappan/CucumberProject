package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.drivers;
import io.cucumber.java.en.*;

public class TC04_forgetPassword extends drivers{

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	@When("User clicks the forget password")
	public void user_clicks_the_forget_password() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='Forgot password ?']")).click();
	}

	@Then("User enters the {string} and {string} and {string}")
	public void user_enters_the_and_and(String EmailID, String Password, String ConfirmPassword) {
		driver.findElement(By.xpath("//input[@placeholder='Enter your email here...']")).sendKeys("expleo@expleo.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your new password']")).sendKeys("expleo");
		driver.findElement(By.xpath("//input[@placeholder='Confirm your new password']")).sendKeys("expleo");
	}


	@Then("User clicks the Reset Password")
	public void user_clicks_the_reset_password() {
		driver.findElement(By.xpath("//button[text()='Reset Password']")).click();
	}

	@Then("User redirected to the login page")
	public void user_redirected_to_the_login_page() {
		System.out.println("User redirected to the login page");

	}

	@Then("User enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String Username, String Password) {
		driver.findElement(By.name("username")).sendKeys("expleo@expleo.com"); 
		driver.findElement(By.name("Password")).sendKeys("expleo"); 

	}

	@Then("User clicks the login button and navigate to the dashboard page")
	public void user_clicks_the_login_button_and_navigate_to_the_dashboard_page() {
		System.out.println("User clicks the login button and navigate to the dashboard page");

	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		driver.quit();
	}



}
