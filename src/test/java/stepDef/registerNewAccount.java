package stepDef;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.allDrivers;
import io.cucumber.java.en.*;

public class registerNewAccount {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User enters into the login page")
	public void user_enters_into_the_login_page() {
		driver.get("http://192.168.99.141:3000");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User Clicks the Register New Account")
	public void user_clicks_the_register_new_account() throws InterruptedException {
		
		WebElement reg = driver.findElement(By.xpath("//h4[text()='Register new account']")); // (//h4[normalize-space()='Register new account'])[1]"));
//		reg.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reg);
		Thread.sleep(1000);
	}
	
	@When("User Enters {string}{string} and {string}")
	public void user_enters_and(String Email, String Password, String ConfirmPassword) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("confirmPassword")).sendKeys(ConfirmPassword);
	}

	@Then("User clicks the Register button")
	public void user_clicks_the_register_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("User should get the Success Message")
	public void user_should_get_the_success_message() throws InterruptedException {
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.xpath("//h2[text()='Registration successful!']"));
		String text = success.getText();
		System.out.println(text);
		Thread.sleep(2000);
		WebElement nav_login_page_btn = driver.findElement(By.xpath("//button[text()='Navigate to login Page']"));
		nav_login_page_btn.click();
		Thread.sleep(2000);
	}

	@Then("quit the 1st Browser for registerUser")
	public void quit_the_1st_browser_for_register_user() {
		
		driver.quit();
		System.out.println("***********New Registration Scenario1 completed successfully**********************");
		
	}
	
//Scenario2>>>>
	
	@Given("User enters the new registered {string} and {string}")

	public void userEntersTheNewRegisteredAnd(String Username, String Password) throws Exception {

		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys(Username);

		driver.findElement(By.id("Password")).sendKeys(Password);

	}

	@When("User clicks the submit button")

	public void userClicksTheSubmitButton() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(1000);

	}

	@Then("User should be logged in Successfully")

	public void userShouldBeLoggedInSuccessfully() throws Exception {

		Thread.sleep(2000);
		WebElement tile = driver.findElement(By.xpath("//p[@class='text-lg font-bold text-white']"));
		String page_title = tile.getText();
		assertEquals("ExpleoSurance", page_title);
		
		System.out.println(page_title+" is validated successfully");
		System.out.println("Logged in successfully");

	}
	
	@Then("User should be logged out Successfully")

	public void userShouldBeLoggedOutSuccessfully() {

		System.out.println("Logged in successfully");
		WebElement logout_btn = driver.findElement(By.xpath("//button[text()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
		
		System.out.println("Logged out successfully");
	}
	
	@Then("quit the 2nd Browser for registerUser")
	public void quit_the_2nd_browser_for_register_user() {
		
		driver.quit();
		System.out.println("***********New Registration Scenario1 completed successfully**********************");
		
	}
	
}