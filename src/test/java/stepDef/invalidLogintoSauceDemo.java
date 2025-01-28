package stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import driver.drivers;
import io.cucumber.java.en.When;

public class invalidLogintoSauceDemo extends drivers {

	@When("User enter invalid Username and Password")
	public void user_enter_invalid_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");	
	}
	
	@When("An error message should be displayed")
	public void an_error_message_should_be_displayed() throws IOException {
		driver.findElement(By.id("login-button")).click();
		TakesScreenshot screenshot = (TakesScreenshot) driver;             
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);          
		File destinationFile = new File("target/screenshot.png"); 
		FileUtils.copyFile(srcFile, destinationFile);
	  // driver.findElement(By.xpath("//div[@class='error-message-container error']")).
	}


}
