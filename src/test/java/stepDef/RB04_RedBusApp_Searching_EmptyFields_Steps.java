package stepDef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB04_RedBusApp_Searching_EmptyFields_Steps extends drivers{

	@Then("Validate the mandatory error message for empty field")
	public void validate_the_mandatory_error_message_for_empty_field() throws InterruptedException {
		Thread.sleep(5000);
		String ex_error_msg = "Enter 'From' and 'To";
		WebElement empty_error =driver.findElement(By.xpath("//div[@class='sc-jTzLTM bIZuun']"));
		String empty_error_msg = empty_error.getText();
		assertEquals(ex_error_msg, empty_error_msg);
		System.out.println("Mandatory Field Error message : "+empty_error_msg+" is validated successfully");
		
	    
	}
}
