package stepDef;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC07_deleteAccount extends drivers {
	

	@When("User clicks the delete button for the selected Users")
	public void user_clicks_the_delete_button_for_the_selected_users() {
		WebElement table = driver.findElement(By.xpath("//div//following::tr[@class='tableHead']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) 
		{
			String text = header.getText();
			System.out.println("Headers: "+text); 
		}
	}

	@Then("User should be deleted in the Dashboard")
	public void user_should_be_deleted_in_the_dashboard() {
		
		System.out.println("User should be deleted in the Dashboard");
	    
	}
	


}
