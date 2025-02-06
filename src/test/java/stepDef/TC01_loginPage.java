package stepDef;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
>>>>>>> f545637ad6966003fc2c30516b7fd1a47ce765c8
import driver.drivers;
import io.cucumber.java.en.*;

public class TC01_loginPage extends drivers {		

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("Expleosurance Page launched from hooks Successfully");

	}

	@When("User should login {string} and {string}")
	public void user_should_login_and(String username, String password) throws Exception {
		driver.findElement(By.name("username")).sendKeys(username);  //"suthirshana.muniyappan@expleogroup.com"
		driver.findElement(By.id("Password")).sendKeys(password); //"Suthir"
	}

	@When("Clicks the Submit button")
	public void clicks_the_login_button() throws Throwable {
		Actions actions = new Actions(driver);
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(login_btn).build().perform();
	}

	@Then("The User should be redirected to the dashboard page")
	public void the_user_should_be_redirected_to_the_dashboard_page() throws InterruptedException {

		Actions actions = new Actions(driver);
		WebElement logout_btn = driver.findElement(By.xpath("//button[text()='Logout']"));
		//		actions.moveToElement(logout_btn).click().build().perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
		System.out.println("Login Successful");
	}
	
	@Given("User Enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}
 
	@When("User Click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
 
	@Then("Error message will be displayed")
	public void error_message_will_be_displayed() {
		WebElement error = driver.findElement(By.xpath("//p[contains(text(), \"Invalid username or password\")]"));
		String text = error.getText();
		System.out.println(text);   
	}
	@Given("User Enters Empty {string} and {string}")
	public void user_enters_empty_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}
 
	@When("User Clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
 
	@Then("Error message will be displayed as Username and password are required")
	public void error_message_will_be_displayed_as_username_and_password_are_required() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Username and password are required']")));
		String text = error.getText();
		System.out.println(text);
	}
}

}