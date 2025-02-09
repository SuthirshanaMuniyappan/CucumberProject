package stepDef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB02_RedBusApp_Invalid_Destination_Steps extends drivers{
	
	@Then("Validate the mandatory error message for To field")
	public void validate_the_mandatory_error_message_for_to_field() throws Throwable {
	    
		Thread.sleep(5000);
		String ex_error_msg = "Enter 'From' and 'To";
		WebElement oops_error =driver.findElement(By.xpath("//div[@class='sc-jTzLTM bIZuun']"));
		String oops_error_msg = oops_error.getText();
		assertEquals(ex_error_msg, oops_error_msg);
		System.out.println("Mandatory Field Error message : "+oops_error_msg+" is validated successfully");
		
	}

}
